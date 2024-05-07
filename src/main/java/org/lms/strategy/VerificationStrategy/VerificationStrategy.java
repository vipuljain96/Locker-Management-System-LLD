package org.lms.strategy.VerificationStrategy;

import org.lms.model.enums.VerificationStrategyType;

public abstract class VerificationStrategy {

    public VerificationStrategy openStrategy(VerificationStrategyType verificationStrategyType){
        switch (verificationStrategyType){
            case OTP:
                return new OTPBasedStrategy();
            default:
                return new OTPBasedStrategy();
        }
    }

}
