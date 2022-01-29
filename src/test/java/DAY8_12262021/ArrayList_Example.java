package DAY8_12262021;

import java.util.ArrayList;




public class ArrayList_Example {
    public static void main(String[]args){


        /*ArrayList is a resizable array which means you dont need ot add the length to add more array values
         */

       ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Queens");
        cities.add("Manhattan");

        //shortcut for println in sout lowercase
        System.out.println("my city is " + cities.get(2));

        ArrayList<Integer> streetNumber = new ArrayList<>();
        streetNumber.add(111);
        streetNumber.add(112);
        streetNumber.add(113);
        System.out.println("my city is " + cities.get(2) + " and third house number is " + streetNumber.get(2));


}
}