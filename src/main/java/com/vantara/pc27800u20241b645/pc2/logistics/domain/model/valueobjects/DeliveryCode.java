package com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects;

public record DeliveryCode(String code) {
    public DeliveryCode {
        if (code == null || code.isBlank()){
            throw new IllegalArgumentException("The delivery code cant be null");
        }
    }
}
