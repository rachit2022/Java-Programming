class Monkey {
    void jump() {
        System.out.println("Jumping");
    }

    void bite() {
        System.out.println("Bite");
    }
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello sir!");
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class Animal {
    public static void main(String args[]) {
        Human h = new Human();
        h.speak();
        h.bite();
        h.eat();
        h.jump();
    }
}
