package DAY2_120521;

public class ForLoop {
    public static void main(String[] args) {

        //iterate through all boroughs define by dynamic array using for loop
        String[] boroughs = new String[7];
        boroughs[0] = "Brooklyn";
        boroughs[1] =   "Queens";
        boroughs[2] = "Manhattan";
        boroughs[3] =  "Bronx";
        boroughs[4] =  "Staten";
        boroughs[5] =  "LI";

        //for (int i =0; i <4; i++) {     ORIGINAL LINE
        for (int i =0; i <boroughs.length-1; i++) {

            //print statement
            System.out.println("my current borough is " + boroughs[i]);
        }

    }

}
