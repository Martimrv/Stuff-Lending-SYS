package controller;

import java.util.ArrayList;

import model.Member;

public class MemberController implements MemberInterface {
    private final ArrayList<Member> memberList;

    /**
     * Constructor.
     */
    public MemberController() {
        memberList = new ArrayList<Member>();
    }

    /**
     * Gets member list.
     * @return member ArrayList.
     */
    @Override
    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    /**
     * Add member to Members List.
     * @param member to add to the List.
     */
    @Override
    public void addMember(Member member) {
        memberList.add(member);
    }
    /**
     * Method to change Member info.
     */
    @Override
    public Member changeInfo(String id, String name, String identificationNb) {
        for (Member member : memberList) {
            if(member.getId().equalsIgnoreCase(id)) {
                member.setName(name);
                member.setIdentificationNumber(identificationNb);
                return member;
            }
        }
        throw new IllegalArgumentException("Member not found");
    }
}