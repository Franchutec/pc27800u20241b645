package com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.embbedables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PackageLoadPersistenceEmbbedable
{
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "unit", nullable = false)
    private String unit;

    public PackageLoadPersistenceEmbbedable() {
    }

    public PackageLoadPersistenceEmbbedable(Integer quantity, String unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
