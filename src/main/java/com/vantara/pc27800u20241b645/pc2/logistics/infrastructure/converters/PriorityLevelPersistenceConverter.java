package com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.converters;

import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.DeliveryStatus;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.PriorityLevel;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.WarehouseId;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.UUID;

@Converter
public class PriorityLevelPersistenceConverter implements AttributeConverter<PriorityLevel, Integer> {
    @Override
    public Integer convertToDatabaseColumn(PriorityLevel attribute) {
        return attribute == null ? null : attribute.prioritLevel();
    }

    @Override
    public PriorityLevel convertToEntityAttribute(Integer dbData) {
        return dbData == null ? null : new PriorityLevel(dbData);
    }

}
