package Stalls;

public class CandyFlossStall extends Stall{

    public CandyFlossStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, 2);
    }

    public String getOwnerName(){
        return ownerName;
    }


}
