package Attractions;

import Interfaces.ISecurity;
import ThemePark.Visitor;

public class Playground extends Attraction implements ISecurity {

    String type;

    public Playground(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Boolean allowEntry(Visitor visitor){

        if (visitor.getAge() < 15){
            return true;
        }
        else {
            return false;
        }
    }

}
