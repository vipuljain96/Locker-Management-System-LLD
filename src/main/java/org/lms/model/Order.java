package org.lms.model;

public class Order {
    int orderId;
    PackageItem packageItem;

    public Order (int orderId, PackageItem packageItem){
        this.orderId = orderId;
        this.packageItem = packageItem;
    }
}
