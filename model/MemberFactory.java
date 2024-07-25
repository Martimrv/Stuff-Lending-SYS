package model;

public class MemberFactory {
    public static Member createMember(String id, String name, String idNumber, String email) {
        return new Member(name, idNumber,email);
    }
}
