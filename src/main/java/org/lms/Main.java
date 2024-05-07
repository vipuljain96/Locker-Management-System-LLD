package org.lms;

import org.lms.strategy.LockerSelectionStrategy.RandomLockerSelectionStrategy;
import org.lms.model.Locker;
import org.lms.model.PackageItem;
import org.lms.LockerManagementSystem.LockerSystem;

public class Main {
    public static void main(String[] args) {

        PackageItem packageItem = new PackageItem("A11", 5,"MOBILE", "Some Description", 22.0);
        Locker locker = new Locker("LOCKER01",30);
        LockerSystem lockerSystem = new LockerSystem();
        lockerSystem.addLocker(locker);
        lockerSystem.allocateLocker(new RandomLockerSelectionStrategy(),packageItem);

    }
}