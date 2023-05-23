package efs.task.oop;

public class Villager implements Fighter {
    String name;
    int age;
    int health;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
    }

    public void sayHello() {
        System.out.println("Greeting traveler... I'm " + name + " and I am " + age + " years old.");
    }

    @Override
    public void attack(Fighter victim) {
//        System.out.println("Atakuje villager");
        victim.takeHit((int) ((100 - age * 0.5) / 10));
    }

    @Override
    public void takeHit(int damage) {
        health -= damage;
    }
}
