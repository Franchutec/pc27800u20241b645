package com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.embbedables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.time.LocalDate;

@Embeddable
public class DeliveryWindowPersistenceEmbbedable {

    @Column(name = "incident_start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "incident_end_date", nullable = false)
    private LocalDate endDate;

    public DeliveryWindowPersistenceEmbbedable() {
    }

    public DeliveryWindowPersistenceEmbbedable(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
