package com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.converters;

import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.DeliveryCode;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.UUID;

@Converter
public class DeliveryCodePersistenceConverter implements AttributeConverter<DeliveryCode, String> {

    @Override
    public String convertToDatabaseColumn(DeliveryCode attribute) {
        return attribute == null ? null : attribute.code();
    }

    @Override
    public DeliveryCode convertToEntityAttribute(String dbData) {
        return dbData == null ? null : new DeliveryCode(dbData);
    }
}
