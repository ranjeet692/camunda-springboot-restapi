package com.ranjeet.order.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;

public class DefaultVariables {
	private DefaultVariables() {
		
	}
	
	public static Map<String, Object> loadDefaultVariables() {

        Map<String, Object> variables = new HashMap<String, Object>();
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", MediaType.APPLICATION_JSON_VALUE);
        variables.put("headers", headers);
        variables.put("orderStatus", "Nil");
        variables.put("orderStatus", 0);
        return variables;
    }
}
