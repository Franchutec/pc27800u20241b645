package com.vantara.pc27800u20241b645.pc2.logistics.domain.model.valueobjects;

public record PackageLoad(Integer quantity, String unit) {
    public PackageLoad {
        if (quantity > 0 || unit == null || unit.isBlank()){
            throw new IllegalArgumentException("Package Load can not be null or blank or zero");
        }

    }

    public PackageLoad increasedBy(Integer addiotionalQuantity) {
        Integer suma = this.quantity + addiotionalQuantity;

        if (addiotionalQuantity == null || addiotionalQuantity < 0 || suma > Integer.MAX_VALUE ) {
            throw new IllegalArgumentException("The increased operation can not be increased by 0, null or be higher than the max value");
        }
        return new PackageLoad(suma, this.unit);

    }
}
