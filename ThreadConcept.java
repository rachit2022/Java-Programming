class Mythread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 1 running");
            System.out.println("I am good");
        }
    }
}

class Mythread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thread 2 running");
            System.out.println("I am bad");
        }
    }
}

public class ThreadConcept {
    public static void main(String args[]) {
        Mythread1 m1 = new Mythread1();
        Mythread2 m2 = new Mythread2();
        m2.start();
        m1.start();
    }
}