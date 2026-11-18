package com.vantara.pc27800u20241b645.pc2.logistics.application.commands;

import java.util.UUID;

public record CreateDeliveryOrderCommand(String deliveryCode,
                                        UUID werehouseId,
                                        String deliveryWindowStartDate,
                                        String deliveryWindowEndDate,
                                        Integer quantity,
                                        String unit,
                                        Integer priorityLevel ) {
}
