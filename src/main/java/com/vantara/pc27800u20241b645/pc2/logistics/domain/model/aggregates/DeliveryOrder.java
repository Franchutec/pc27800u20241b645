package com.vantara.pc27800u20241b645.pc2.logistics.domain.model.aggregates;

import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.*;

public class DeliveryOrder {

    private Long id;

    private DeliveryCode deliveryCode;
    private WarehouseId werehouseId;
    private DeliveryWindow deliveryWindow;
    private PackageLoad packageLoad;
    private PriorityLevel priorityLevel;
    private DeliveryStatus status;

    public DeliveryOrder(Long id, DeliveryCode deliveryCode, WarehouseId werehouseId, DeliveryWindow deliveryWindow, PackageLoad packageLoad, PriorityLevel priorityLevel, DeliveryStatus status) {
        this.id = id;
        this.deliveryCode = deliveryCode;
        this.werehouseId = werehouseId;
        this.deliveryWindow = deliveryWindow;
        this.packageLoad = packageLoad;
        this.priorityLevel = priorityLevel;
        this.status = status;
    }

    public DeliveryOrder(DeliveryCode deliveryCode, WarehouseId werehouseId, DeliveryWindow deliveryWindow, PackageLoad packageLoad, PriorityLevel priorityLevel) {
        this.deliveryCode = deliveryCode;
        this.werehouseId = werehouseId;
        this.deliveryWindow = deliveryWindow;
        this.packageLoad = packageLoad;
        this.priorityLevel = priorityLevel;
    }

    public Long getId() {
        return id;
    }

    public DeliveryCode getDeliveryCode() {
        return deliveryCode;
    }

    public WarehouseId getWerehouseId() {
        return werehouseId;
    }

    public DeliveryWindow getDeliveryWindow() {
        return deliveryWindow;
    }

    public PackageLoad getPackageLoad() {
        return packageLoad;
    }

    public PriorityLevel getPriorityLevel() {
        return priorityLevel;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

}



