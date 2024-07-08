package model;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private String name;
    private String description;
    private String category;
    private int dayOfCreation;
    private int cost;
    private boolean isLended;
    private Member owner;
    private List<Contract> contractList = new ArrayList<>();

    /**
     * Constructors.
     */
    public Item(String name){
        this.name = name;
    }

    public Item(String name, String description, String category, int creationDay, int cost, Member owner){
        this.name = name;
        this.description = description;
        this.category = category;
        this.dayOfCreation = creationDay;
        this.cost = cost;
        this.owner = owner;
    }

    public Item(String name, String description, String category, int creationDay, int cost, boolean status, Member owner){
        this.name = name;
        this.description = description;
        this.category = category;
        this.dayOfCreation = creationDay;
        this.cost = cost;
        this.isLended = status;
        this.owner = owner;
    }

    /**
     * Getters and Setters.
     */

     public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setDayCreation(int creationDay){
        this.dayOfCreation = creationDay;
    }

    public int getCreationDay(){
        return dayOfCreation;
    }

    public void setItemCost(int cost){
        this.cost = cost;
    }

    public int getItemCost(){
        return cost;
    }

    public void setStatus(boolean status){
        this.isLended = status;
    }

    public boolean getStatus(){
        return isLended;
    }

    public void setOwner(Member owner){
        this.owner = owner;
    }

    public Member getOwner(){
        return owner;
    }

    




}
