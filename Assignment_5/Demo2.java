package Assignment_5;

public class Demo2 {
    String str;
    Demo2(String string)
    {
        this.str = string;
    }

    public void demo2_method(String s) {
        // static members can only be accessible in static methods.
        str=s;
    }

    public void print() {
        System.out.println(str);
    }

    public static void main(String[] args)
    {
        String str = "ABCD";
        Demo2 obj = new Demo2(str);
        obj.demo2_method(str);
        obj.print();
    }
}
