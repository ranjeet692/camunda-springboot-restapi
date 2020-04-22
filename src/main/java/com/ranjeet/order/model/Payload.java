package com.ranjeet.order.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Payload implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productId;
    private Integer quantity;
    private Double price;
    private String emailId;
    
	public Payload() {
		
	}
	
	public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    @Override
    public String toString() {
        return new ToStringBuilder(this)
        		.append("productId", productId)
                .append("quantity", quantity)
                .append("price", price)
                .append("emailId", emailId)
                .toString();
    }
}

