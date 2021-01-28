package student.classes;

import java.util.Arrays;
import java.util.Scanner;

public class CommonIO {

    //private static  Scanner scanner = new Scanner(System.in); I could not get to work
    static final int ERROR_RETURN_INT = -1; //constant - this value will not change
    static final String ERROR_RETURN_STRING = "Error";
    //using static methods so they can be used without initialising the object
    public static int userIOInt(String outputToUser) {
        try {
            System.out.print(outputToUser);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }catch(Exception e)
        {
            System.err.println("Error" + e.toString());
            return ERROR_RETURN_INT;
        }
    }

    public static String userIOString(String outputToUser){
       try {
           System.out.print(outputToUser);
           Scanner scanner = new Scanner(System.in);
           return scanner.nextLine();
       }catch(Exception e)
       {
           System.err.println("Error" + e.toString());
           return ERROR_RETURN_STRING;
       }


    }

    static void userIOMenu() {
        //moved it here just to practice on refactoring - but it can actually be made to a common method with menu points as input strings
        for (String s : Arrays.asList("1:Add New Product to inventory",
                "2:List the Products in Inventory",
                "3:Number of products in inventory",
                "4: Exit")) {
            System.out.println(s);

        }
    }
}
