package com.vantara.pc27800u20241b645.pc2.logistics.domain.repositories;

import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.aggregates.DeliveryOrder;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.DeliveryCode;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.DeliveryWindow;

import java.util.List;
import java.util.Optional;

public interface DeliveryOrdersRepository {
    Optional<DeliveryOrder> findById(Long id);
    DeliveryOrder save(DeliveryOrder deliveryOrder);
    boolean existsById(Long id);
    boolean existsByDeliveryCode(DeliveryCode deliveryCode);
    Optional<DeliveryOrder> findByDeliveryCode(DeliveryCode deliveryCode);
    List<DeliveryOrder> findAll();
}