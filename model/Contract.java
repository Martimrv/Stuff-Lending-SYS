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


}
