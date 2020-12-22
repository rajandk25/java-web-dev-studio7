package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD("Rocket",200, "files", "personal", 3.5);
        DVD myDvd = new DVD("Launch", 300, "accounts", "buisness", 4.5);
        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.println(myCd.spinDisc());
        System.out.println(myDvd.spinDisc());

    }
}
