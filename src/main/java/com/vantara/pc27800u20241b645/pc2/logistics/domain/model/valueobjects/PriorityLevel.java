package com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects;

public record PriorityLevel(Integer prioritLevel) {
    public PriorityLevel {
        if (prioritLevel < 1 || prioritLevel > 5){
            throw new IllegalArgumentException("The delivery code cant be null");
        }
    }
}
