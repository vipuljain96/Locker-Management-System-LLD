package org.lms.LockerManagementSystem;

import org.lms.model.Order;
import org.lms.strategy.LockerSelectionStrategy.LockerSelectingStrategy;
import org.lms.model.Locker;
import org.lms.model.OTP;
import org.lms.model.PackageItem;

import java.util.*;

public class LockerSystem {

    private Map<String, Locker> lockers;
    private Map<String, OTP> otps;

    public LockerSystem() {
        lockers = new HashMap<>();
        otps = new HashMap<>();
    }

    public void allocateLocker(LockerSelectingStrategy selectingStrategy,
                                 PackageItem packageItem){
        Locker locker = selectingStrategy.allocateLocker(lockers,packageItem);
        lockers.put(packageItem.getPackageItemId(), locker);

        int otpCode = generateOTP();
        OTP otp = new OTP(otpCode);
        otps.put(packageItem.getPackageItemId(), otp);
        locker.setOccupied(true);

        int orderId = generateOrderId();
        Order order = new Order(orderId, packageItem);
        locker.getAllOrders().add(order);
    }

    public void accessLocker(String packageId, int enteredOTP){
        if(otps.containsKey(packageId)){
            OTP otp = otps.get(packageId);
            if(otp.getOptCode() == enteredOTP){
                Locker locker = lockers.get(packageId);
                if(locker!=null && locker.isOccupied()){
                    System.out.println("Releasing the Locker");
                    locker.setOccupied(false);
                } else{
                    System.out.println("Locker is Empty");
                }
            }else{
                System.out.println("INVALID OTP!!");
         }
        } else{
            System.out.print("Package Not Found!");
        }
    }

    public void addLocker(Locker locker){
        lockers.put("RandomPackageId", locker);
    }

    private int generateOTP(){
        Random random = new Random();
        int randomInt = 0;
        for(int i=0;i<6;i++){
            randomInt  = randomInt * 10;
            randomInt += random.nextInt(10);
        }
        return randomInt;
    }

    private int generateOrderId(){
        Random random = new Random();
        int randomInt = 0;
        for(int i=0;i<4;i++){
            randomInt  = randomInt * 10;
            randomInt += random.nextInt(10);
        }
        return randomInt;
    }
}
