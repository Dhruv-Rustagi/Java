package Assignment_7;

interface A {
    void printA();
    void displayA();
}

interface B {
    void printB();
    void displayB();
}

interface C {
    void printC();
    void displayC();
}

interface D extends A,B,C {
    void printD();
    void displayD();
}

class E implements D {

    E() {
        System.out.println("Contructor of class E");
    }

    public void printA() {
        System.out.println("Print method of interface A");
    }

    public void displayA() {
        System.out.println("Display method of interface A");
    }

    public void printB() {
        System.out.println("Print method of interface B");
    }

    public void displayB() {
        System.out.println("Display method of interface B");
    }

    public void printC() {
        System.out.println("Print method of interface C");
    }

    public void displayC() {
        System.out.println("Display method of interface C");
    }

    public void printD() {
        System.out.println("Print method of interface D");
    }

    public void displayD() {
        System.out.println("Display method of interface D");
    }
}

public class Assignment_7_3 {
    static void method1(A i)
    {
        i.printA();i.displayA();
    }
    static void method2(B i)
    {
        i.printB();i.displayB();
    }
    static void method3(C i)
    {
        i.printC();i.displayC();
    }
    static void method4(D i)
    {
        i.printD();i.displayD();
    }
    public static void main(String[] args) {
        E obj = new E();

        method1(obj);
        method2(obj);
        method3(obj);
        method4(obj);

    }
}
