package Assignment_6;

// Create a class with a constructor that takes a String argument. During construction, print the argument. Create an array of object references to this class, but don’t actually create objects to assign into the array. When you run the program, notice whether the initialization messages from the constructor calls are printed.

public class Assignment_6_3 {

    // Nothing is Printed

    Assignment_6_3(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Assignment_6_3[] arr = new Assignment_6_3[10];
    }
}