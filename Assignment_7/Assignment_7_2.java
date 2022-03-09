package Assignment_7;


abstract class Cycle
{
    public abstract void balance();
}

class Unicycle extends Cycle
{
    public void balance()
    {
        System.out.println("balance method in Unicycle");
    }
}

class Bicycle extends Cycle
{
    public void balance()
    {
        System.out.println("balance method in Bicycle");
    }
}

class Tricycle extends Cycle
{

    // Getting error as when we are inheriting any abstract class, all the methods of that abstract class must be declared.
    // To remove error, declare balance() method here.

    public void balance()
    {
        System.out.println("balance method in Tricycle");
    }
}

public class Assignment_7_2
{
    public static void main(String[] args) {

        Cycle[] arr = new Cycle[3];

        arr[0] = new Unicycle();
        arr[0].balance();

        arr[1] = new Bicycle();
        arr[1].balance();

        arr[2] = new Tricycle();
        arr[2].balance();
    }
}
