package com.nur;

public class Packet {
    private String Message ;
    private String sourceAddress ;
    private String targetAddress ;

    public Packet (String  message , String sourceAddress ,String targetAddress)
    {
        this.Message = message ;
        this.sourceAddress = sourceAddress ;
        this.targetAddress = targetAddress ;
    }

    public void setMessage(String message)
    {
        this.Message = message ;
    }
    public String getMessage()
    {
        return Message ;
    }
    public void setSourceAddress(String sourceAddress)
    {
        this.sourceAddress = sourceAddress ;
    }
    public String getSourceAddress()
    {
        return sourceAddress;
    }

    public String getTargetAddress() {
        return targetAddress;
    }

    public void setTargetAddress( String targetAddress) {
        this.targetAddress = targetAddress ;
    }
}
