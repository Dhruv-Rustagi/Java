package Assignment_7;

// Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class, provide methods that are common to all Rodents, and override these in the derived classes to perform different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens. Make the methods of Rodent abstract whenever possible and all classes should have default constructors that print a message about that class.

abstract class Rodent{
    Rodent()
    {
        System.out.println("Constructor of Rodent class");
    }
    public abstract void language();
    public abstract void name();
}

class Mouse extends Rodent
{
    Mouse()
    {
        System.out.println("Constructor of Mouse class");
    }

    public void language()
    {
        System.out.println("Mouse speaks English");
    }

    public void name()
    {
        System.out.println("I am Mouse");
    }
}

class Gerbil extends Rodent
{
    Gerbil()
    {
        System.out.println("Constructor of Gerbil class");
    }

    public void language()
    {
        System.out.println("Gerbil speaks Hindi");
    }

    public void name()
    {
        System.out.println("I am Gerbil");
    }
}

class Hamster extends Rodent
{
    Hamster()
    {
        System.out.println("Constructor of Hamster class");
    }

    public void language()
    {
        System.out.println("Hamster speaks French");
    }

    public void name()
    {
        System.out.println("I am Hamster");
    }
}

public class Assignment_7_1 {
    public static void main(String[] args) {

        Rodent[] arr = new Rodent[3];

        arr[0] = new Mouse();
        arr[0].language();
        arr[0].name();

        arr[1] = new Gerbil();
        arr[1].language();
        arr[1].name();

        arr[2] = new Hamster();
        arr[2].language();
        arr[2].name();
    }
}
