package Attractions;

import ThemePark.Visitor;

public class Rollercoaster extends Attraction{

    String type;

    public Rollercoaster(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Boolean allowEntry(Visitor visitor){
        if (visitor.getHeight() >= 145){
            return true;
        }
        else {
            return false;
        }
    }


}
