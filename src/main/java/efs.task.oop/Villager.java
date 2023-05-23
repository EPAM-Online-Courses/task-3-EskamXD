package efs.task.oop;

public class Villager implements Fighter {
    String name;
    int age;
    private int health = 100;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old");
    }

    @Override
    public void attack(Fighter victim) {
//        System.out.println("Atakuje villager");
        victim.takeHit((int) (100 - age * 0.5) / 10);
    }

    @Override
    public void takeHit(int damage) {
        this.health -= damage;
    }
}
