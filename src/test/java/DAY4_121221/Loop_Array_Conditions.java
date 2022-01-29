package DAY4_121221;

public class Loop_Array_Conditions {

    public static void main(String[] args) {

        // declare arrays
        String[] cities = new String[4];
        cities[0] = "Queens";
        cities[1] = "Manhattan";
        cities[2] = "Bronx";
        cities[3] = "Brooklyn";

        int i =0;

        while(i<cities.length) {
            //two if conditoins
            if (cities[i] == "Brooklyn") {
                System.out.println("This is the city " + cities[i]);
            } else if (cities[i] == "Queens") {
                System.out.println("this is the city " + cities[i]);
            }//end else
        i++;
        }




    }// method

}//class
