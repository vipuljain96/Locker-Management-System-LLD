package org.lms.model;

public class DeliveryPerson {

    String name;
    int deliveryPersonId;
    PackageItem packageIem;

    public DeliveryPerson(String name,
                          int deliveryPersonId,
                          PackageItem packageItem,
                          Locker locker){
        this.name = name;
        this.deliveryPersonId = deliveryPersonId;
        this.packageIem = packageItem;
    }



}
