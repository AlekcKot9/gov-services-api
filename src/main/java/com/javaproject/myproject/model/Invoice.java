package com.javaproject.myproject.model;

public class Invoice {
    private Long userId;  // Для связи с пользователем
    private String serviceType;  // Газ, вода, электричество
    private Double amount;

    public Invoice(Long userId, String serviceType, Double amount) {
        this.userId = userId;
        this.serviceType = serviceType;
        this.amount = amount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}