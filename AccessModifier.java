class Student {
    private String name;
    private int roll_num;

    public void Namesetter(String n) {
        name = n;
    }

    public String Namegetter() {
        return name;
    }

    public void RollNumberSetter(int r) {
        roll_num = r;
    }

    public int RollNumberGetter() {
        return roll_num;
    }
}

public class AccessModifier {
    public static void main(String args[]) {
        Student s = new Student();
        s.Namesetter("Rachit");
        System.out.println("Name is: " + s.Namegetter());
        s.RollNumberSetter(32);
        System.out.println("Roll number is: " + s.RollNumberGetter());
    }

}
