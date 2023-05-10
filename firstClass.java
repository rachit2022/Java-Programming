class student {
    int roll_no;
    String name;
}

public class firstClass {

    public static void main(String args[]) {
        student s = new student();
        s.name = "Rachit";
        s.roll_no = 32;
        System.out.println("Name: " + s.name);
        System.out.println("Roll number is: " + s.roll_no);

    }

}
