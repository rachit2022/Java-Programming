public class CGPA {
    public static void main(String[] args) {
        float m1 = 85;
        float m2 = 90;
        float m3 = 95;
        float total = m1 + m2 + m3;
        float percentage = (total / 300) * 100;
        float cgpa = percentage / 9.8f;
        System.out.print("The CGPA is: ");
        System.out.println(cgpa);
    }

}
