package model;

public class BoatFactory {
    public static Boat createBoat(String owner, String type, double size) {
        return new Boat(owner, type, size);
    }
}
