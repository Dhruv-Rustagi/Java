package Assignment_7;

interface cycle {
    void name();
    void factories();
}

class unicycle implements cycle {

    public void name() {
        factories();
    }

    public void factories() {
        System.out.println("factories method of class unicycle");
    }
}

class bicycle implements cycle {

    public void name() {
        factories();
    }

    public void factories() {
        System.out.println("factories method of class bicycle");
    }
}

class tricycle implements cycle {

    public void name() {
        factories();
    }

    public void factories() {
        System.out.println("factories method of class tricycle");
    }
}

public class Assignment_7_4 {
    public static void main(String[] args) {

        unicycle obj1 = new unicycle();
        obj1.name();

        bicycle obj2 = new bicycle();
        obj2.name();

        tricycle obj3 = new tricycle();
        obj3.name();
    }
}
