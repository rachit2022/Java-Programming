class MyThr extends Thread {
    MyThr(String name) {
        super(name);
        System.out.println("Name is: " + name);
    }

    public void run() {
        // while (true) {
        // System.out.println("I am a thread");
        // }
        System.out.println("Thank you");
    }
}

public class constructorThread {
    public static void main(String agrs[]) {
        MyThr m = new MyThr("Rachit");
        m.start();
        System.out.println("The ID is: " + m.getId());
        System.out.println("The name is: " + m.getName());
    }
}
