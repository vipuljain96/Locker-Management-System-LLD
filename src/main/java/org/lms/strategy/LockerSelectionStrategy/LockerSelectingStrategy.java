package org.lms.strategy.LockerSelectionStrategy;

import org.lms.model.Locker;
import org.lms.model.PackageItem;

import java.util.Map;

public abstract class LockerSelectingStrategy {

    public abstract Locker allocateLocker(Map<String,Locker> lockers, PackageItem packageItem);
}
