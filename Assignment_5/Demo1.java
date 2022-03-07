package Assignment_5;

public class Demo1 {

    public int val1;
    char val2;

    public void display() {

        // possible to print the values of instance variables.
        System.out.println("The value of val1 is : " + val1);
        System.out.println("The character at val2 is : " + val2);
    }

    public void show() {
        // not possible to print the values of local variables.
        // It will give error of not initializing the variables.


//        int val3;
//        char val4 ;
//        System.out.println("The value of val3 is : " + val3);
//        System.out.println("The character at val4 is : " + val4);
    }
}
