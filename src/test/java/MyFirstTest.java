import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class MyFirstTest {

    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>();

//    @Before
//    public void setUpValues(){
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList2.add(1);
//        arrayList2.add(2);
//    }

//    @Test
    // This will fail because its two different arrays
//    public void testObjectSameness(){
//        assertSame(arrayList, arrayList2);
//    }


    @Test  // <-- This is a annotation
    public void additionMethodTest(){
        long input1 = 20;
        long input2 = 30;
        long expected = 50;
        assertEquals(expected,MathOperations.add(input1, input2));
    }

    @Test
    public void tipAppTest(){
        double cost = 22.56;
        double tip = 20;
        double expected = 4.51;
        assertEquals(expected, MathOperations.tip(cost, tip), 0.01);
    }

    @Test
    public void TestArrayEquality(){
        int[] startArray = {1, 2, 3, 4, 5};
        int[] endArray = {2, 3, 4, 5, 6};

        assertArrayEquals(endArray, MathOperations.addOneToArray(startArray));
    }

    // Warm-up Exercises
    @Test
    // Create a test method that uses assertEquals or assertNotEquals to verify if the String Codeup is the same as CodeUp.
    public void testIfEqual(){
        String arg1 = "Codeup";
        String arg2 = "CodeUp";

//        assertNotEquals(arg1,arg2); // This is true
        assertEquals(arg1,arg2);     // This says that it's not
    }

    @Test
    // Create a test method that uses assertNotSame to verify that the following ArrayLists are not the same:
    public void notSame(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages,moreLanguages); // They are not the same
    }

    @Test
    // Create a test method that uses assertArrayEquals to verify the following arrays are equal.
    public void arrayEquals(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers,otherNumbers); // This equals the same
    }

// Create a test method that uses both assertFalse and assertTrue to verify the following statements:
    @Test
    public void trueOrFalse(){
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }







}// End of MyFirstTest
