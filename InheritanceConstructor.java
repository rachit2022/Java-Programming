class Base {
    public Base() {
        System.out.println("I am base class constructor");
    }

    public Base(int a) {
        System.out.println("I am base class constructor with value a: " + a);
    }
}

class Derived extends Base {
    public Derived() {
        System.out.println("I am Derived class constructor");
    }

    public Derived(int x, int y) {
        super(x);
        System.out.println("I am Derived class constructor with value x: " + x + " and y: " + y);
    }
}

public class InheritanceConstructor {
    public static void main(String args[]) {
        // Derived d = new Derived();
        Derived d = new Derived(14, 16);
    }

}
