package com.ranjeet.order.controller;

import java.util.Map;
import java.util.logging.Logger;

import org.camunda.bpm.engine.RuntimeService;
import com.ranjeet.order.LoggerDelegate;
import com.ranjeet.order.util.DefaultVariables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class PayloadRequest {
	private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());
    private RuntimeService runtimeService;
    
    @Autowired
    public PayloadRequest(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }
    
    @RequestMapping(value = "/order", method = RequestMethod.POST)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public String order(@RequestBody com.ranjeet.order.model.Payload payload) {

    	LOGGER.info("*** Inbound request received");
    	LOGGER.info("*** Payload = " + payload);
        Map<String, Object> variables = DefaultVariables.loadDefaultVariables();
        variables.put("inboundPayload", payload);
        variables.put("productId", payload.getProductId());
        variables.put("quantity", payload.getQuantity());
        variables.put("price", payload.getPrice());
        variables.put("emailId", payload.getEmailId());
        runtimeService.startProcessInstanceByKey("orderworkflow1", variables);
        return "{ \"workflow\" : \"orderworkflow1\",   \"status\" : \"started\" }";
    }
}
