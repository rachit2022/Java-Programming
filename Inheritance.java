class base {
    int a;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}

class Derived extends base {
    int b;

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Derived d = new Derived();
        d.setA(4);
        System.out.println("Value of a is: " + d.getA());
        d.setB(8);
        System.out.println("Value of b is: " + d.getB());
    }

}
