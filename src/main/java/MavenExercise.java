import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a input: ");
        String userInput= sc.nextLine();


//        boolean isNumber = StringUtils.isNumeric(userInput);
//        System.out.printf("You Entered : %s%n %s%n", userInput, isNumber);

//        String flippedString = StringUtils.swapCase(userInput);
//        System.out.println(flippedString);
//
//        String reversedString = StringUtils.reverse(userInput);
//        System.out.println(reversedString);

        // Another way to do it is

       boolean isNumeric = StringUtils.isNumeric(userInput);
            if ( !isNumeric ){
                System.out.println("You Entered : " + userInput);
                System.out.println(userInput + " Is not a number");
            } else {
                System.out.println(userInput + " Is a number");
            }


        System.out.println(StringUtils.swapCase(userInput));

        System.out.println(StringUtils.reverse(userInput));



    } // end of main
} // End of mavenexercise
