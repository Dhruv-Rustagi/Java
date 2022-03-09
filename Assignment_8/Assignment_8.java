package Assignment_8;

class Exception1 extends Exception {
    Exception1(String s)
    {
        super(s);
    }
}

class Exception2 extends Exception {
    Exception2(String s)
    {
        super(s);
    }
}

class Exception3 extends Exception {
    Exception3(String s)
    {
        super(s);
    }
}
public class Assignment_8 {
    static void check1() throws Exception1 {
        throw new Exception1("Exception 1");
    }
    static void check2() throws Exception2 {
        throw new Exception2("Exception 2");
    }
    static void check3() throws Exception3 {
        throw new Exception3("Exception 3");
    }
    public static void main(String[] args) {
        try {
            check1();
        }
        catch (Exception e1) {
            System.out.println("Catch block of Exception 1");
            System.out.println("Exception is " + e1);
            try {
                check2();
            }
            catch (Exception e2) {
                System.out.println("Catch block of Exception 2");
                System.out.println("Exception is " + e2);
                try {
                    check3();
                }
                catch (Exception e3) {
                    System.out.println("Catch block of Exception 1");
                    System.out.println("Exception is " + e1);
                }
            }
        }
        finally {
            System.out.println("Finally block called");
        }
    }
}

