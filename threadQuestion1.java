class greet extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class greet1 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(2);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
        }

    }
}

public class threadQuestion1 {
    public static void main(String args[]) {
        greet g = new greet();
        greet1 g1 = new greet1();
        g.start();
        g1.start();
    }

}
