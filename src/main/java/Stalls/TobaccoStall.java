package Stalls;

public class TobaccoStall extends Stall{

    public TobaccoStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, 3);
    }

    public String getOwnerName(){
        return ownerName;
    }


}
