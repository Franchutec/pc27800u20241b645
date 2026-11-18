package com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects;

import java.util.UUID;

public record WarehouseId(UUID value) {
    public WarehouseId {
        if (value == null ){
            throw new IllegalArgumentException("The warehouse id cant be null");
        }
    }
}
