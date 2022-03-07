package Basics;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;

        int addition = a+b;
        int subtraction = a-b;
        int multiplication = a*b;
        int division = a/b;
        int modulus = a%b;

        System.out.println(a + " + " + b + " = " +  addition);
        System.out.println(a + " - " + b + " = " +  subtraction);
        System.out.println(a + " * " + b + " = " +  multiplication);
        System.out.println(a + " / " + b + " = " +  division);
        System.out.println(a + " % " + b + " = " +  modulus);
    }
}
