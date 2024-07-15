package model;

public class MemberFactory {
    public static Member createMember(int id, String name, int idNumber, String email) {
        return new Member(name, idNumber,email);
    }
}
