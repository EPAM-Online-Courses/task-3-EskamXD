package efs.task.oop;

public class ExtraordinaryVillager extends Villager {
    enum Skill {
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        // Field for description
        String description;

        // Constructor
        Skill(String description) {
            this.description = description;
        }
        // Getter
        String getDescription() {
            return description;
        }
    }

    Skill skill;

    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    @Override
    public void sayHello() {
        System.out.println("Greeting traveler... I'm " + name + " and I'm " + age + " years old. " + skill.getDescription());
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit(0);    
    }

    @Override
    public void takeHit(int damage) {
        health = 0;
    }
}