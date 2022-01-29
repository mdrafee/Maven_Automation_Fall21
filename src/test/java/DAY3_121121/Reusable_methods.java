package DAY3_121121;

public class Reusable_methods {

    //create a void method that will add two numbers
    public static void add (int x, int y) {
        System.out.println("Result of addition is " + (x + y));
    }           // end add

    // create subtrtact method
    public static void subtract (int x, int y) {

        System.out.println("Result of subtract is " + (x - y));
    }//end subtract

    //create a return metho that will add two numers and return the reasuts of it
    public static int addReturn ( int x, int y ){
        //declare anew int var store y+y
        int result = x + y;
        System.out.println("Result of addition is " + result);
        return result;
    }



    }//end class



