package Assignment_5;

// Create a class in a package yourname.assignment.data containing an int and a char member variables that are not initialized, add a method to print these variables. Add another method in the same class with two local variables and print their values without initializing them.

// Create another class in package yourname.assignment.singleton containing a non static String member variable. Add a static method that takes String as parameter and initialize the member variable and then return object of that class. Add a non static method to print the String.

// Create main class in package yourname.assignment.main, create object of first class and call both the methods to print the values. Create object of second class using static method and then call the other method to print the String.

public class Assignment_5 {
    public static void main(String[] args) {
        Demo1 obj1 = new Demo1();

        obj1.display();
        obj1.show();

        Demo2 obj2 = new Demo2("str while declaring method");
        obj2.demo2_method("str overriding");
        obj2.print();
    }


}
