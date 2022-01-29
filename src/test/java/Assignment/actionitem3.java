package Assignment;

public class actionitem3 {

    public static void main(String[] args) {

        // declare arrays
        String[] cities = new String[4];
        cities[0] = "brooklyn";
        cities[1] = "queens";
        cities[2] = "manhattan";
        cities[3] = "staten";

        //for while there reuiqres a starting porint

        //now for while statement
   //    for (int i=0; i<= cities.length && cities[i]=="Brooklyn"; i++){
       //     System.out.println( "this is the right city " + cities[i]);
    //    }

        for (int i = 0; i < cities.length; i++){
            if( cities[i].equals("brooklyn") || cities[i].equals("manhattan")){
                System.out.println("This is the right city: " + cities[i]);
            }
        }




    }// method

}
