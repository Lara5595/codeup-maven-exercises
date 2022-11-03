import java.util.Arrays;

public class Kitchen {

    private static String[] tortillas;


    // Constructor
    public Kitchen(){
        this.tortillas = new String[0];
    }


    // Checks if its empty
    public boolean isEmpty(){
        return tortillas.length == 0;
    }


    // Add one
    public void add(String tortilla){
        String[] copy = Arrays.copyOf(tortillas, tortillas.length+1);
        copy[tortillas.length] = tortilla;
        tortillas = copy;
    }

    // Remove one
    public void pop(){
        if (tortillas.length > 0){ // added the if statement
            tortillas[tortillas.length-1] = null;
            String[] copy = Arrays.copyOf(tortillas, tortillas.length-1);
            tortillas = copy;
        }
    }


    // Checks if it contains
    public boolean contains(String tortilla){
        for (int i = 0; i < tortillas.length; i++){
            if(tortillas[i].equals(tortilla))
                return true;
        }
        return false;
    }


    // Prints all in the array
    public void printAll(){
        for (int i = tortillas.length-1; i >= 0; i--){
            System.out.println("tortillas["+i+"] " + tortillas[i]);
        }
    }


    // Size of the array
    public int size(){
        return tortillas.length;
    }


    public static void main(String[] args) {

    Kitchen kitchen = new Kitchen();

    kitchen.add("corn");
    kitchen.add("Maiz");
    kitchen.add("potato");
        System.out.println(kitchen.size());
        kitchen.printAll();

        System.out.println(kitchen.isEmpty());
        System.out.println(kitchen.contains("Maiz"));


        kitchen.pop();
        kitchen.printAll();

    } // end of main



} // end of kitchen


