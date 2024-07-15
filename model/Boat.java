package model;


/**
 * Boat Class.
 */
public class Boat {
    private String boatID;
    private String boatType;
    private double boatSize;
    private String ownerID;

    /**
     * Constructors.
     */
    public Boat(){}

    public Boat(String owner, String boatType, double boatSize) {
        this.ownerID = owner;
        this.boatType = boatType;
        this.boatSize = boatSize;
    }

    public Boat(String type, double size){
        this.boatType = type;
        this.boatSize = size;
    }

    /**
     * Getters and Setters.
     */
    public String getBoatID(){
        return boatID;
    }

    public void setBoatID(String id){
        this.boatID = id;
    }

    public String getBoatType(){
        return boatType;
    }

    public void setBoatType(String type){
        this.boatType = type;
    }

    public double getBoatSize(){
        return boatSize;
    }

    public void setBoatSize(double size){
        this.boatSize = size;
    }

    public String getOwnerID(){
        return ownerID;
    }
}
