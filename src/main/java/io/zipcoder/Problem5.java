package io.zipcoder;

public class Problem5 {

    public static String reverseString5(String input){

       // String[] inpout = new String[input]; Started this at the end.

        for(int i = input.length(); i > 0; i--){
            input = input + Integer.toString(i);
           // System.out.println(input);

        }
        return input;



    }
}
