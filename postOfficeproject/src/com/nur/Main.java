package com.nur;

public class Main {

    public static void main(String[] args) {
        Packet packet = new Packet("Gift" , "Karabük", "İstanbul");
        mailService mS = new mailService();
        mS.sendPacket(packet);
        mS.receiveMessage(packet);
    }
}
