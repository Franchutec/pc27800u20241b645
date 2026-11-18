package com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects;

import java.time.LocalDate;
import java.util.UUID;

public record DeliveryWindow(LocalDate startDate, LocalDate endDate) {
    public DeliveryWindow {
        if(startDate == null || endDate == null) {
            throw new IllegalArgumentException("Start date and end date cannot be null");
        }

        if(endDate.isBefore(startDate)) {
            throw new IllegalArgumentException("End date cannot be before start date");
        }
    }

    public boolean isOnTime(LocalDate checkDate) {
        return checkDate.isBefore(endDate) && checkDate.isAfter(startDate);
    }

}
