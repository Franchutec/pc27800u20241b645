package com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.repositories;


import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.DeliveryCode;
import com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.entities.DeliveryOrderPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeliveryOrderJpaRepository extends JpaRepository<DeliveryOrderPersistenceEntity, Long> {

    boolean existsByDeliveryCode(DeliveryCode deliveryCode);

    Optional<DeliveryOrderPersistenceEntity> findByDeliveryCode(DeliveryCode claimIdentifier);

}
