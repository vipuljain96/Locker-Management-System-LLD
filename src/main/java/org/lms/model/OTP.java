package org.lms.model;

public class OTP {

    int optCode;

    public OTP(int optCode){
        this.optCode = optCode;
    }

    public int getOptCode(){
        return optCode;
    }
    public void setOptCode(int optCode) {
        this.optCode = optCode;
    }
}
