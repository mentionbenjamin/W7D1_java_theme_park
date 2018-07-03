package Stalls;

import Interfaces.ISecurity;
import ThemePark.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, 3);
    }

    public String getOwnerName(){
        return ownerName;
    }


    public Boolean allowEntry(Visitor visitor){
        if (visitor.getAge() >= 18){
            return true;
        }
        else {
            return false;
        }
    };

}
