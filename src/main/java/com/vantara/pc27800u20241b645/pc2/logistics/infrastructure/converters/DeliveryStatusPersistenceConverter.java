package com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.converters;

import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.DeliveryStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class DeliveryStatusPersistenceConverter implements AttributeConverter<DeliveryStatus, String> {

    @Override
    public String convertToDatabaseColumn(DeliveryStatus attribute) {
        return attribute == null ? null : attribute.name();
    }

    @Override
    public DeliveryStatus convertToEntityAttribute(String dbData) {
        return dbData == null ? null : DeliveryStatus.valueOf(dbData);
    }


}
