package DAY2_120521;

public class WhileLoop {

    public static void main(String[] args) {

        // create array before anything else baka
        String[] borough = new String[5];
        borough[0] = "Brooklyn";
        borough[1]  =   "Queens";
        borough[2]  =   "Manhattan";
        borough[3]  =   "Bronx";
        borough[4]  =   "LI";


        // declare new starting point
        int i= 0;
        // define while loop with your end point (condition)
        while (i<borough.length) {

            System.out.println("My current borough is " + borough[i]);
            i = i+1;   // end point to stop infinite loop
        }



    }
}
