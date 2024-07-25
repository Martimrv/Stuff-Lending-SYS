package controller;

import java.util.ArrayList;
import model.*;

public interface MemberInterface {
    ArrayList<Member> getMemberList();
    void addMember(Member member);
    Member changeInfo(String id, String name, String identificationNb);
}
