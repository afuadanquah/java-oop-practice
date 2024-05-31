package org.practice.inheritence;

public class Tub {

    //Access Modifers
//    private int size;
    private final int size;

    //Access Modifers
//    private String type
    private final String type;

    public Tub() {
    }

    public Tub(int size, String type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tub{" +
                "size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
