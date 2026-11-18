package com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.mappers;

import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.aggregates.DeliveryOrder;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.DeliveryWindow;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.PackageLoad;
import com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.adapters.DeliveryOrderPersistenceAdapter;
import com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.embbedables.DeliveryWindowPersistenceEmbbedable;
import com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.embbedables.PackageLoadPersistenceEmbbedable;
import com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.entities.DeliveryOrderPersistenceEntity;

public class DeliveryOrderPersistenceMapper {
    public static DeliveryOrder toDomain(DeliveryOrderPersistenceEntity entity) {
        return new DeliveryOrder(
                entity.getDeliveryCode(),
                entity.getWarehouseId(),
                new DeliveryWindow(
                        entity.getDeliveryWindow().getStartDate(),
                        entity.getDeliveryWindow().getEndDate()
                ),
                new PackageLoad(
                        entity.getPackageLoad().getQuantity(),
                        entity.getPackageLoad().getUnit()
                ),
                entity.getPriorityLevel()
        );
    }

    public static DeliveryOrderPersistenceEntity toEntity(DeliveryOrder entity) {
        return DeliveryOrderPersistenceEntity.builder()
                .deliveryCode(entity.getDeliveryCode())
                .warehouseId(entity.getWerehouseId())
                .deliveryWindow(
                        new DeliveryWindowPersistenceEmbbedable(
                                entity.getDeliveryWindow().startDate(),
                                entity.getDeliveryWindow().endDate()
                        )
                )
                .packageLoad(
                        new PackageLoadPersistenceEmbbedable(
                                entity.getPackageLoad().quantity(),
                                entity.getPackageLoad().unit()
                        )
                )
                .priorityLevel(entity.getPriorityLevel())
                .build();

    }
}
