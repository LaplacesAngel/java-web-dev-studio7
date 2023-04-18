package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCd = new CD();
        DVD myDVD = new DVD("James Bond");

        myCd.spinDisc();
        myDVD.spinDisc();

        myCd.writeData("More data to write");
        System.out.println(myCd.readData());

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
