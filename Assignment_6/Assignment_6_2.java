package Assignment_6;

// Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.

class Power{
    int ans;
    Power(int a)
    {
        ans = (int)Math.pow(a,2);
        System.out.println(ans);
    }
    Power(int a, int b)
    {
        new Power(a);
        new Power(b);
    }
}
public class Assignment_6_2 {
    public static void main(String[] args) {
        Power p1 = new Power(2);
        Power p2 = new Power(3,4);
    }
}