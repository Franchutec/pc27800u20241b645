package com.vantara.pc27800u20241b645.pc2.logistics.domain.model.aggregates;

import com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects.*;

public class DeliveryOrder {

    private Long id;

    private DeliveryCode deliveryCode;
    private WarehouseId werehouseId;
    private DeliveryWindow deliveryWindow;
    private PackageLoad packageLoad;
    private Integer priorityLevel;
    private DeliveryStatus status;
    private String deliveryNotes;

    public DeliveryOrder(Long id, DeliveryCode deliveryCode, WarehouseId werehouseId, DeliveryWindow deliveryWindow, PackageLoad packageLoad, Integer priorityLevel, DeliveryStatus status, String deliveryNotes) {
        this.id = id;
        this.deliveryCode = deliveryCode;
        this.werehouseId = werehouseId;
        this.deliveryWindow = deliveryWindow;
        this.packageLoad = packageLoad;
        this.priorityLevel = priorityLevel;
        this.status = status;
        this.deliveryNotes = deliveryNotes;
    }

    public DeliveryOrder(DeliveryCode deliveryCode, WarehouseId werehouseId, DeliveryWindow deliveryWindow, PackageLoad packageLoad, Integer priorityLevel, String deliveryNotes) {
        this.deliveryCode = deliveryCode;
        this.werehouseId = werehouseId;
        this.deliveryWindow = deliveryWindow;
        this.packageLoad = packageLoad;
        this.priorityLevel = priorityLevel;
        this.deliveryNotes = deliveryNotes;
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

    public Integer getPriorityLevel() {
        return priorityLevel;
    }

    public DeliveryStatus getStatus() {
        return status;
    }

    public String getDeliveryNotes() {
        return deliveryNotes;
    }
}



