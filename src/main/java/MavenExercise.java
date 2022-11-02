import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a input: ");
        String userInput= sc.nextLine();

        if (StringUtils.isNumeric(userInput)){
            System.out.println( userInput + " That is a number ");
        } else {
            System.out.println("You Entered : " + userInput);
            System.out.println(userInput + " Is not a number");
        }

        System.out.println("Flipped Case : " + StringUtils.swapCase(userInput));

        System.out.println("Reverse Case : " + StringUtils.reverse(userInput));




    } // end of main
} // End of mavenexercise
