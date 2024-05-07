package org.lms.strategy.LockerSelectionStrategy;

import org.lms.model.Locker;
import org.lms.model.PackageItem;

import java.util.Map;

public class RandomLockerSelectionStrategy extends LockerSelectingStrategy {

    @Override
    public Locker allocateLocker(Map<String,Locker> lockers, PackageItem packageItem) {
        for(Map.Entry<String,Locker> entry : lockers.entrySet()){
            Locker locker = entry.getValue();
            if(!locker.isOccupied()){
                return locker;
            }
        }
        throw new RuntimeException("ERROR: NO UnOccupied Locker Found");
    }
}
