public class NonStaticFunc {
    int add(int x, int y) {
        return (x + y);
    }

    public static void main(String args[]) {
        int a = 5, b = 8;
        NonStaticFunc obj = new NonStaticFunc();
        int c = obj.add(a, b);
        System.out.println("The sum of two number is: " + c);
    }

}
