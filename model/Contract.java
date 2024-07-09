package model;

public class Contract {
    private int startDate;
    private int endDate;
    private Item item;
    private Member member;

    /*
     * Constructors.
     */

    public Contract(int startDate, int endDate, Item item, Member member){
        this.startDate = startDate;
        this.endDate = endDate;
        this.item = item;
        this.member = member;
    }

    public Contract(int startDate, int endDate, Member member){
        this.startDate = startDate;
        this.endDate = endDate;
        this.member = member;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }
    
    public int getStartDate() {
        return startDate;
    }
    
    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }
    
    public int getEndDate() {
        return endDate;
    }

    public void setMember(Member member){
        this.member = member;
    }

    public Member getMember(){
        return member;
    }

    public String getMemberName(){
        return member.getName();
    }

    public void setItem(Item item){
        this.item = item;
    }

    public Item getItem(){
        return item;
    }

    /**
     * Method to check if any contract over laps the desired dates.
     * @param lendStartDate
     * @param lendEndDate
     * @return
     */
    public boolean contractOverLaps(int lendStartDate, int lendEndDate){
        return !(lendEndDate < this.startDate || lendStartDate > this.endDate);
    }

    /**
     * Methodto check if given date is within contract date range.
     */
    public boolean dateWithinContract(int date){
        return date>= startDate && date<= endDate;
    }

    /**
     * Checks if Lender name already exists.
     */
    public boolean lenderNameMatch(String lenderName){
        return this.member.getName().equals(lenderName);
    }
}
