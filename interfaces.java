interface Bicylce {
    void applyBrake(int decrement);

    void Speedup(int increment);
}

interface HornBicycle {
    void blowHorn();

    void blowHorn2();
}

class AvonCycle implements Bicylce, HornBicycle {
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    public void Speedup(int increment) {
        System.out.println("Applying SpeedUp");
    }

    public void blowHorn() {
        System.out.println("peee peee");
    }

    public void blowHorn2() {
        System.out.println("poo pooo");
    }
}

public class interfaces {
    public static void main(String args[]) {
        AvonCycle a = new AvonCycle();
        a.applyBrake(1);
        a.Speedup(1);
        a.blowHorn();
        a.blowHorn2();
    }
}