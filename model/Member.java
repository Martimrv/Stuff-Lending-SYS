package model;
import java.util.*;

/**
 * Member class.
 * Representa data related only to Member.
 */
public class Member {
    private int id;
    private String name;
    private int identificationNb;
    private String email;
    private ArrayList<Boat> boatList;

    /**
     * Constructors.
     */
    public Member(String name, int idNumber, String email) {
        this.name = name;
        this.identificationNb = idNumber;
        this.email = email;
        boatList = new ArrayList<>();
    }

    public Member(int id, String name, int idNumber, String email) {
        this.id = id;
        this.name = name;
        this.identificationNb = idNumber;
        this.email = email;
    }

    /**
     * Getters and Setters.
     */
    public int getId() {
        return id;
    }

    public void setMemberId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return identificationNb;
    }

    public void setIdNumber(int idNumber) {
        this.identificationNb = idNumber;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public ArrayList<Boat> getBoatList() {
        return boatList;
    }

    /**
     * Method to add Boat to boatList.
     */
    public void addBoat(Boat boat){
        boatList.add(boat);
    }

    /**
     * Method to remove Boat.
     */
    public void removeBoat(Boat boat){
        boatList.remove(boat);
    }
}
