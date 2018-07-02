package Stalls;

public class IceCreamStall extends Stall{

    public IceCreamStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, 1);
    }

    public String getOwnerName(){
        return ownerName;
    }


}
