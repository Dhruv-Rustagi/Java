package Assignment_7;

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
