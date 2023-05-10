class Employee {
    String name;
    int roll_num;

    public Employee() {
        name = "Rachit";
        roll_num = 32;
    }
}

public class constructors {
    public static void main(String args[]) {
        Employee s = new Employee();
        System.out.println("Name is: " + s.name);
        System.out.println("Roll number is: " + s.roll_num);
    }
}
