package controller;

import model.Boat;
import model.Member;

public class BoatController implements BoatInterface {

    @Override
    public void addBoatToMember(Member member, String type, int size) {
        if (member != null) {
            Boat boat = new Boat(type, size);
            member.addBoat(boat);
        }
        throw new UnsupportedOperationException("Unimplemented method 'addBoatToMember'");
    }

    @Override
    public void removeBoat(Member member, String boatID) {
        if (member != null) {
            for (Boat boat:member.getBoatList()){
                if (boat.getBoatID().equals(boatID)) {
                    member.removeBoat(boat);
            }
        }
        throw new UnsupportedOperationException("Unimplemented method 'removeBoat'");
        }
    }

    @Override
    public void changeBoat(Member member, String boatID, String type, double size) {
        for (Boat boat: member.getBoatList()){
            if (boat.getBoatID().equals(boatID)) {
                boat.setBoatType(type);
                boat.setBoatSize(size);
                int boatIndex = member.getBoatList().indexOf(boat);
                member.getBoatList().set(boatIndex, boat);
        }
        throw new UnsupportedOperationException("Unimplemented method 'changeBoat'");
        }
    }
}
