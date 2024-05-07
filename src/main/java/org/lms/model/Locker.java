package org.lms.model;

import java.util.ArrayList;
import java.util.List;

public class Locker {

    String lockerId;
    boolean isOccupied;
    int maxCapacityOfLocker;
    List<PackageItem> packageItemList;
    List<Order> orderList;

    public Locker(String lockerId, int maxCapacityOfLocker){
        this.lockerId = lockerId;
        this.maxCapacityOfLocker = maxCapacityOfLocker;
        this.packageItemList = new ArrayList<>();
        this.isOccupied = false;
        this.orderList = new ArrayList<>();
    }

    public List<Order> getAllOrders(){
        return orderList;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getMaxCapacityOfLocker() {
        return maxCapacityOfLocker;
    }

    public void setMaxCapacityOfLocker(int maxCapacityOfLocker) {
        this.maxCapacityOfLocker = maxCapacityOfLocker;
    }

    public List<PackageItem> getPackageItemList() {
        return packageItemList;
    }

    public void setPackageItemList(List<PackageItem> packageItemList) {
        this.packageItemList = packageItemList;
    }

}
