package com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.converters;

import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.WarehouseId;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.UUID;

@Converter
public class WarehouseIdPersistenceConverter implements AttributeConverter<WarehouseId, UUID> {

    @Override
    public UUID convertToDatabaseColumn(WarehouseId attribute) {
        return attribute == null ? null : attribute.value();
    }

    @Override
    public WarehouseId convertToEntityAttribute(UUID dbData) {
        return dbData == null ? null : new WarehouseId(dbData);
    }
}
