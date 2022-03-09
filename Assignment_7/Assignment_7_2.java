package Assignment_7;

// Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle. Try to call balance( ) on each element of the array and observe the results. Downcast and call balance( ) and observe what happens.

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
