package org.practice.inheritence;

import org.practice.interfaces.WetRoom;

public class Shower extends Bathroom implements WetRoom {

    private boolean isLocatedDownstairs;

    public Shower(boolean isLocatedDownstairs) {
        this.isLocatedDownstairs = isLocatedDownstairs;

    }

    @Override
    public void setTub(Tub tub) {
        super.setTub(tub);
        System.out.println("There is also a shower in this room");
    }


    @Override
    public boolean isForAccessibility() {
        return true;
    }

    @Override
    public String setIsForAccessibility(boolean isForAccessibility) {
        String result = "";
        if (!isForAccessibility) {
           result = "This bathroom is also a wetroom that has a walk-in shower.";
        } else {
            result = "This bathroom's wetroom has a chair for a user with disabilities.";
        }

        return result;
    }

    @Override
    public String toString() {
        return "Shower{" +
                "isLocatedDownstairs=" + isLocatedDownstairs +
                "} " +
                "\nWhat type of wetroom is in the bathroom? " + setIsForAccessibility(isForAccessibility()) + " " + super.toString();
    }
}
