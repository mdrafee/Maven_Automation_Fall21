package Assignment;

public class ActionItem1 {


    public static void main(String[] args) {

        String [] zipcode = new String[4];

            zipcode[0]  =   "1000";
            zipcode[1]  =   "10001";
            zipcode[2]  =   "10002";
            zipcode[3]  =   "10003";

        int[] streetNumber = new int[4];
            streetNumber[0]  =   60;
            streetNumber[1]  =   70;
            streetNumber[2]  =   80;
            streetNumber[3]  =   90;
//WHILE LOOP
         int i = 0;
         while (i< streetNumber.length){


 //FOR LOOP
             //    for (int i=0; i< streetNumber.length; i++){
              System.out.println("My Zip code is "+ zipcode[i]+" and me street address is " + streetNumber[i]);
             i=i+1;

        }


    }

    }