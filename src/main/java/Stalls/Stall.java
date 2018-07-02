package Stalls;

public abstract class Stall {

    public String name;
    public String ownerName;
    public int parkingSpot;

    public Stall(String name, String ownerName, int parkingSpot){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName(){
        return this.name;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public int parkingSpot(){
        return this.parkingSpot;
    }
}
