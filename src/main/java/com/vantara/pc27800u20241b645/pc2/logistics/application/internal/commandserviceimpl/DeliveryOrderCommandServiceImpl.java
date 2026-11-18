package com.vantara.pc27800u20241b645.pc2.logistics.application.internal.commandserviceimpl;

import com.vantara.pc27800u20241b645.pc2.logistics.application.commands.CreateDeliveryOrderCommand;
import com.vantara.pc27800u20241b645.pc2.logistics.application.commandservices.DeliveryOrderCommanService;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.aggregates.DeliveryOrder;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.*;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.repositories.DeliveryOrdersRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DeliveryOrderCommandServiceImpl implements DeliveryOrderCommanService {

    private final DeliveryOrdersRepository deliveryOrdersRepository;

    public DeliveryOrderCommandServiceImpl(DeliveryOrdersRepository deliveryOrdersRepository) {
        this.deliveryOrdersRepository = deliveryOrdersRepository;
    }

    @Override
    public DeliveryOrder handle(CreateDeliveryOrderCommand command) {

        DeliveryCode deliveryCode = new DeliveryCode(command.deliveryCode());

        if (deliveryOrdersRepository.existsByDeliveryCode(deliveryCode)) {
            throw new IllegalArgumentException(
                    "A delivery code with this identifier already exists"
            );
        }

        WarehouseId warehouseId = new WarehouseId(command.warehouseId());

        DeliveryWindow deliveryWindow = new DeliveryWindow(
                LocalDate.parse(command.deliveryWindowStartDate()),
                LocalDate.parse(command.deliveryWindowEndDate())
        );

        PackageLoad packageLoad = new PackageLoad(
                command.quantity(),
                command.unit()
        );

        PriorityLevel priorityLevel = new PriorityLevel(command.priorityLevel());

        DeliveryOrder deliveryOrder = new DeliveryOrder(deliveryCode, warehouseId, deliveryWindow, packageLoad, priorityLevel);

        return deliveryOrdersRepository.save(deliveryOrder);

    }
}