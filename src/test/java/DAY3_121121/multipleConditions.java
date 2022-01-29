package DAY3_121121;

import java.awt.*;

public class multipleConditions {
    public static void main(String[] args) {
        //define the set of variables
        int a = 2;
        int b = 3;
        int c = 4;


        //verify a+b >c, a=b < c or a+b == c
        if (a + b > c) {
            System.out.println("a &b is greater than c");
        } else if (a + b < c) {
            System.out.println("a & b is les than c");
        } else if (a + b == c) {
            System.out.println("a & b is equal than c");

        } //if else ends
    } //main
}//class




