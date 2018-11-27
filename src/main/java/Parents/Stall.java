package Parents;

import Behaviours.IReviewed;

public abstract class Stall implements IReviewed{

    //Using a Stall abstract class (which has a name, ownerName and parkingSpot),
    // create some classes for IceCreamStall, CandyFlossStall, TobaccoStall

    //All Attractions and Stalls have a class variable int rating
    //All Attractions and Stalls implement IReviewed and implement a getter for int getRating() and String getName()

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, int parkingSpot){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = 0;
    }


}
