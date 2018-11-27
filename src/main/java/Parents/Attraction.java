package Parents;

import Behaviours.IReviewed;

public abstract class Attraction implements IReviewed {

    //Using an Attraction abstract class (which has a name), create some subclasses
    // for Rollercoaster, Dodgems, Park, Playground

    //All Attractions and Stalls have a class variable int rating
    //All Attractions and Stalls implement IReviewed and implement a getter for int getRating() and String getName()

    protected String name;
    protected int rating;

    public Attraction(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }

    public String getName() {
        return this.name;
    }
}
