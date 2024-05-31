package org.practice.inheritence;

public class Bathroom {

    //Access Modifiers
    private Tub tub;

    public Bathroom() {
    }

    public Bathroom(Tub tub, boolean isShowerAvailable) {
        this.tub = tub;
    }


    public Bathroom(boolean isShowerAvailable) {
        this.tub = new Tub();
    }

    public Tub getTub() {
        return tub;
    }

    public void setTub(Tub tub) {
        this.tub = tub;
    }



    @Override
    public String toString() {
        return "Bathroom{" +
                "tub=" + tub + '}';
    }
}
