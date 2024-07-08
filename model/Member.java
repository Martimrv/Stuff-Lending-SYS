package model;

import java.util.ArrayList;
import java.util.List;

/**
 * lass for the member.
 * ember haa ID, name, email, phone number
 * nd registration date.
 */
public class Member {
    private String id;
    private String name;
    private String email;
    private int credits;
    private String phoneNumber;
    private int registrationDate;
    //  private List<> owned = new ArrayList<>();
    //  private List<> lended = new ArrayList<>();

    /**
     * Member constructors.
     */

    public Member(String name, String email, String phoneNumber, String id, int registrationDate, int credits) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.credits = credits;
        this.phoneNumber = phoneNumber;
        this.registrationDate = registrationDate;
    }

    public Member(String name, String email, String phoneNumber, String id) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public Member(String name, String email, String phoneNumber, int registrationDate, int credits){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.registrationDate = registrationDate;
        this.credits = credits;
    }

    /**
     * Getters and Setters.
     */

    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    public int getCredits() {
        return credits;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setRegistrationDate(int registrationDate) {
        this.registrationDate = registrationDate;
    }
    
    public int getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Method to add Credits to the member.
     */
    public void addCredits(Member member, int creditsValue){
        this.credits += member.getCredits() + creditsValue;
    }






}

