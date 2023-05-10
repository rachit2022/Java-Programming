abstract class pens {
    abstract void write();

    abstract void refill();
}

class FountainPen extends pens {
    public void write() {
        System.out.println("Write");
    }

    public void refill() {
        System.out.println("Refill");
    }

    void changeNib() {
        System.out.println("Changing the nib");
    }
}

public class pen {
    public static void main(String args[]) {
        FountainPen p = new FountainPen();
        p.changeNib();
        p.write();
        p.refill(); 
    }
}
