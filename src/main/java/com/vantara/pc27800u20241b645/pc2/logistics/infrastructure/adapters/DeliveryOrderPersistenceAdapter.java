package com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.adapters;

import com.vantara.pc27800u20241b645.pc2.logistics.domain.repositories.DeliveryOrdersRepository;
import com.vantara.pc27800u20241b645.pc2.logistics.infrastructure.repositories.DeliveryOrderJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class DeliveryOrderPersistenceAdapter implements DeliveryOrdersRepository {


    private final DeliveryOrderJpaRepository deliveryOrderJpaRepository;

    public ClaimPersistenceAdapter(ClaimJpaRepository claimJpaRepository) {
        this.claimJpaRepository = claimJpaRepository;
    }

    @Override
    public Optional<Claim> findById(Long id) {
        return claimJpaRepository.findById(id)
                .map(ClaimPersistenceMapper::toDomain);
    }

    @Override
    public List<Claim> findAll() {
        return claimJpaRepository.findAll()
                .stream()
                .map(ClaimPersistenceMapper::toDomain)
                .toList();
    }

    @Override
    public Claim save(Claim claim) {
        ClaimPersistenceEntity entity =
                ClaimPersistenceMapper.toEntity(claim);

        ClaimPersistenceEntity savedEntity =
                claimJpaRepository.save(entity);

        return ClaimPersistenceMapper.toDomain(savedEntity);
    }

    @Override
    public boolean existsById(Long id) {
        return claimJpaRepository.existsById(id);
    }

    @Override
    public boolean existsByLemonadeIdentifier(
            LemonadeIdentifier lemonadeIdentifier) {
        return claimJpaRepository.existsByClaimIdentifier(lemonadeIdentifier);
    }

    @Override
    public Optional<Claim> findByLemonadeIdentifier(
            LemonadeIdentifier lemonadeIdentifier) {
        return claimJpaRepository.findByClaimIdentifier(lemonadeIdentifier)
                .map(ClaimPersistenceMapper::toDomain);
    }
}
