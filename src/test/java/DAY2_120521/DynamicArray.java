package DAY2_120521;

import java.net.SocketOption;

public class DynamicArray {
    public static void main(String[] args) {
            // create a string dynamics array for countries
        String[] countries = new String[6]; // set the limit boundaries
        //define arrays
        countries[0]= "USA";
        countries[1] = "Canada";
        countries[2]= "Bangladesh";
        countries[3]= "india";
        countries[4]= "Pakistan";
        countries[5]= "russia";

        System.out.println("My country is " + countries[5]);

        // interfere dynamic array
        int[] houseNumber = new int[4];
        houseNumber[0]= 200;
        houseNumber[1]= 400;
        houseNumber[2]= 500;
        houseNumber[3]= 600;
        System.out.println("My country is "+ houseNumber[3]);

    }


}
