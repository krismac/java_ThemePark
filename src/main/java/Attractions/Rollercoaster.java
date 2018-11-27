package Attractions;

import Behaviours.ISecurity;
import Parents.Attraction;
import Parents.Visitor;

public class Rollercoaster extends Attraction implements ISecurity{

    private String name;
    private int rating;

    public Rollercoaster(String name, int rating){
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        boolean result = false;
        boolean height = (visitor.getHeight() > 145);
        boolean age = (visitor.getAge() >= 12);
        if (height && age) { result = true; }
        return result;
    }

    //Rollercoster implements ISecurity and requires a visitor to be over 145cm tall and over 12 years of age

}
