import java.util.Scanner;

class Employees {
    String name;
    int salary;

    Scanner sc = new Scanner(System.in);

    int getsalary() {
        System.out.print("Enter your salary: ");
        salary = sc.nextInt();
        return salary;
    }

    void setName() {
        System.out.print("Enter your name: ");
        name = sc.nextLine();
    }

    String getName() {
        return name;
    }
}

public class Employee {
    public static void main(String args[]) {
        Employees e = new Employees();
        e.setName();
        System.out.println("Salary is: " + e.getsalary());
        System.out.println("Name is: " + e.getName());
    }

}
