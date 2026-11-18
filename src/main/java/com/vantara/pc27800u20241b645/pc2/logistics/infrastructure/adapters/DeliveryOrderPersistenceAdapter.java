package com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.adapters;

import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.aggregates.DeliveryOrder;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.DeliveryCode;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.repositories.DeliveryOrdersRepository;
import com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.entities.DeliveryOrderPersistenceEntity;
import com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.mappers.DeliveryOrderPersistenceMapper;
import com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.repositories.DeliveryOrderJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DeliveryOrderPersistenceAdapter implements DeliveryOrdersRepository {


    private final DeliveryOrderJpaRepository deliveryOrderJpaRepository;

    public DeliveryOrderPersistenceAdapter(DeliveryOrderJpaRepository deliveryOrderJpaRepository) {
        this.deliveryOrderJpaRepository = deliveryOrderJpaRepository;
    }

    @Override
    public Optional<DeliveryOrder> findById(Long id) {
        return deliveryOrderJpaRepository.findById(id)
                .map(DeliveryOrderPersistenceMapper::toDomain);
    }

    @Override
    public List<DeliveryOrder> findAll() {
        return deliveryOrderJpaRepository.findAll()
                .stream()
                .map(DeliveryOrderPersistenceMapper::toDomain)
                .toList();
    }

    @Override
    public DeliveryOrder save(DeliveryOrder deliveryOrder) {
        DeliveryOrderPersistenceEntity entity =
                DeliveryOrderPersistenceMapper.toEntity(deliveryOrder);

        DeliveryOrderPersistenceEntity savedEntity =
                deliveryOrderJpaRepository.save(entity);

        return DeliveryOrderPersistenceMapper.toDomain(savedEntity);
    }

    @Override
    public boolean existsById(Long id) {
        return deliveryOrderJpaRepository.existsById(id);
    }

    @Override
    public boolean existsByDeliveryCode(
            DeliveryCode deliveryCode) {
        return deliveryOrderJpaRepository.existsByDeliveryCode(deliveryCode);
    }

    @Override
    public Optional<DeliveryOrder> findByDeliveryCode(
            DeliveryCode deliveryCode) {
        return deliveryOrderJpaRepository.findByDeliveryCode(deliveryCode)
                .map(DeliveryOrderPersistenceMapper::toDomain);
    }
}
