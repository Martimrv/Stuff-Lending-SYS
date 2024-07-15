package controller;

import model.Member;

public interface BoatInterface {
    void addBoatToMember(Member member, String type, int length);
    void removeBoat(Member member, String boatID);
    void changeBoat(Member member, String boatID, String type, double size);
}
