package Assignment_7;

// Create a class with an inner class that has a non-default constructor (one that takes arguments). Create a second class with an inner class that inherits from the first inner class.

class A1 {
    A1() {
        System.out.println("Constructor of class A1");
    }

    class A2 {
        A2(int a, int b) {
            System.out.println("Contructor of class A2");
            System.out.println("Value of a and b in class A1 are " + a + " and " + b);
        }
    }
}

class B1 extends A1{
    B1() {
        System.out.println("Constructor of class B1");
    }

    class B2 {
        B2(int a, int b) {
            System.out.println("Contructor of class B2");
            System.out.println("Value of a and b in class B1 are " + a + " and " + b);
        }
    }
}

public class Assignment_7_5 {
    public static void main(String[] args) {
        B1.B2 obj = new B1().new B2(2,3);
    }
}
