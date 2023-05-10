interface Cameras {
    void video();
}

interface wifis {
    void getNetwork();
}

interface GPSs {
    void location();
}

class phones implements Cameras, wifis, GPSs {
    public void video() {
        System.out.println("Taking video");
    }

    public void getNetwork() {
        System.out.println("Connecting to wifi....");
    }

    public void location() {
        System.out.println("Getting a location");
    }
}

public class polymorphism_interface {
    public static void main(String args[]) {
        Cameras c = new phones();
        c.video();

    }

}
