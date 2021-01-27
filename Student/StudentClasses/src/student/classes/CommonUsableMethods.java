package student.classes;

import java.util.Scanner;

public class CommonUsableMethods {

    public int getUserInputInt(String outputToUser) {
        //Todo: bug - need to inputvalidate or gracefully handle the exception when something else then an int. Furthermore - it should probably be a double
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.print(outputToUser);
        result = scanner.nextInt();
        return result;

    }
   public String getUserInputString(String outputToUser){
       //Todo: bug - need to inputvalidate or gracefully handle the exception
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.print(outputToUser);
        result = scanner.nextLine();
        return result;

    }
}
