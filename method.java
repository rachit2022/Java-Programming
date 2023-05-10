public class method {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        method m = new method();
        System.out.println("Addition of a and b is: " + m.add(4, 5));
    }
}
