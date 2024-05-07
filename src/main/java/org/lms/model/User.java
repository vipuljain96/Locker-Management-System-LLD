package org.lms.model;

public class User {

    int userId;
    String userName;
    PackageItem packageItem;

    public User(int userId,
                String userName,
                PackageItem packageItem,
                OTP otp,
                Locker locker){
        this.userId = userId;
        this.userName = userName;
        this.packageItem = packageItem;
    }

    public PackageItem getPackageItem() {
        return packageItem;
    }

    public void setPackageItem(PackageItem packageItem) {
        this.packageItem = packageItem;
    }

}
