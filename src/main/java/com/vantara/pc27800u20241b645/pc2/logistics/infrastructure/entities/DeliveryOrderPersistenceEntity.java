package com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.entities;


import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.DeliveryCode;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.DeliveryStatus;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.WarehouseId;
import com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.converters.DeliveryCodePersistenceConverter;
import com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.converters.WarehouseIdPersistenceConverter;
import com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.embbedables.DeliveryWindowPersistenceEmbbedable;
import com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.embbedables.PackageLoadPersistenceEmbbedable;
import com.vantara.pc27800u20241b645.pc2.shared.infrastructure.persistence.jpa.AuditableAbstractPersistenceEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "delivery_orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliveryOrderPersistenceEntity extends AuditableAbstractPersistenceEntity {
    @Convert(converter = DeliveryCodePersistenceConverter.class)
    @Column(name = "delivery_code", nullable = false, unique = true)
    private DeliveryCode deliveryCode;

    @Convert(converter = WarehouseIdPersistenceConverter.class)
    @Column(name = "warehouse_id", nullable = false)
    private WarehouseId warehouseId;

    @Embedded
    private DeliveryWindowPersistenceEmbbedable deliveryWindow;

    @Embedded
    private PackageLoadPersistenceEmbbedable claimedAmount;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DeliveryStatus status;

    @Column
    private String description;
}
