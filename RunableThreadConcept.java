class MyRunableThread1 implements Runnable {
    public void run() {
        System.out.println("I'm Thread 1");
        System.out.println("I'm Thread 1");
        System.out.println("I'm Thread 1");
        System.out.println("I'm Thread 1");
        System.out.println("I'm Thread 1");
        System.out.println("I'm Thread 1");
        System.out.println("I'm Thread 1");
    }
}

class MyRunableThread2 implements Runnable {
    public void run() {
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 1" );
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
        System.out.println("I'm Thread 2");
    }
}

public class RunableThreadConcept {
    public static void main(String args[]) {
        MyRunableThread1 bullet1 = new MyRunableThread1();
        Thread gun1 = new Thread(bullet1);
        MyRunableThread2 bullet2 = new MyRunableThread2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }

}
