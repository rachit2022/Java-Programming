interface camera {
    void takingSnap();

    void takingVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void taking4Kvideo() {
        greet();
        System.out.println("Taking 4K video......");
    }
}

interface wifi {
    String[] getNetwork();

    void connectToNetwork(String network);
}

class Cellphones {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class SmartPhone extends Cellphones implements camera, wifi {
    public void takingSnap() {
        System.out.println("Taking snap");
    }

    public void takingVideo() {
        System.out.println("Taking video");
    }

    public String[] getNetwork() {
        System.out.println("Getting record of network");
        String[] networkList = { "Idea", "Vodaphone", "Airtel" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to network: " + network);
    }

}

public class phones {
    public static void main(String args[]) {
        SmartPhone ms = new SmartPhone();
        ms.taking4Kvideo();
        String[] ar = ms.getNetwork();
        for (String item : ar) {
            System.out.println(item);
        }

    }

}
