package org.practice;

import org.practice.inheritence.Tub;
import org.practice.inheritence.Shower;

public class Main {
    public static void main(String[] args) {


//        Tub tub2 = new Tub(30, "Round");

//       Bathroom bathroom = new Bathroom(tub2,true);
//
//       Bathroom bathroom1 = new Bathroom(true);
//
//       Bathroom bathroom2 = new Bathroom(new Tub(5, "Rectangle"), false);

        Shower wetRoomShower = new Shower(true);

        System.out.println(wetRoomShower);

        wetRoomShower.setTub(new Tub(2, "wetRoomTub"));


        //Does inheritance have two classes it inherit from?
        //Answer - Takes the state and behaviour from both Shower and Bathroom
        System.out.println(wetRoomShower);



    }
}