package com.nur;

public class mailService {

    public void sendPacket(Packet packet)
    {
        System.out.println(packet.getMessage()+"İs send to " + packet.getSourceAddress()+" to" + packet.getTargetAddress());
    }
    public  void receiveMessage(Packet packet)
    {
        System.out.println(packet.getMessage()+"İs received to " + packet.getSourceAddress()+" to" + packet.getTargetAddress());

    }
}
