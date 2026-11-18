package com.vantara.pc27800u20241b645.pc2.logistics.application.commandservices;

import com.vantara.pc27800u20241b645.pc2.logistics.application.commands.CreateDeliveryOrderCommand;
import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.aggregates.DeliveryOrder;

public interface DeliveryOrderCommanService {
    DeliveryOrder handle(CreateDeliveryOrderCommand command);

}
