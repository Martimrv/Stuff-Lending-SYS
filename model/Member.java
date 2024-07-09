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
    private List<Item> owned = new ArrayList<>();
    private List<Item> lent = new ArrayList<>();

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

    /**
     * Method to remove credits to the member.
     */
    public void removeCredits(Member member, int creditsValue){
        this.credits -= member.getCredits() + creditsValue;
    }

    /**
     * Method to return all owned items.
     */
    public Iterable<Item> getOwnedItems(){
        return owned;
    }

    /**
     * Method to return all lended items.
     */
    public Iterable<Item> getLendedItems(){
        return lent;
    }

    /**
     * Gets Item (by name) form the owner items.
     */
    public Item getItem(String name){
        for(Item item : owned){
            if(item.nameMatches(name)){
                return item;
            }
        }
        return null;
    }

    /**
     * Method to add Item to the member.
     */
    public void addItem(Item item){
        if(item == null){
            throw new IllegalArgumentException("Item cannot be null");
        }
        owned.add(item);
        addCredits(this, 100);
        item.setOwner(this);
    }

    /**
     * Method to remove Item from member account.
     */
    public void removeItem(Item item){
        if(item == null){
            throw new IllegalArgumentException("Item cannot be null");
        }
        owned.remove(item);
        removeCredits(this, 100);
    }

    /**
     * Add lent item.
     */
    public void addLentItem(Item item){
        lent.add(item);
        deduceCredits(item.getContractByLenderName(this));
    }

    /**
     * Method to check if member has enough credits.
     */
    public boolean deduceCredits(Contract contract){
        if (contract == null || contract.getItem() == null){
            throw new IllegalArgumentException("Contract cannot be null");
        }

        int nbOfDays = ContractUtils.calculateDays(contract.getStartDate(), contract.getEndDate());
        int price = ContractUtils.calculateTotalCost(nbOfDays, contract.getItem().getItemCost());

        if (credits >= price){
            removeCredits(this, price);
            return true;
        }
        return false;
    }

    /**
     * Method to check if member has enough credits.
     */
    public boolean checkIfEnoughCred(Member member, Item item, int startDate, int endDate) {
        int totalNbDays = ContractUtils.calculateDays(startDate, endDate);
        int price = ContractUtils.calculateTotalCost(totalNbDays, item.getItemCost());
        if (member.getCredits() >= price){
            return true;
        } else {
            return false;
        }
    }
}

