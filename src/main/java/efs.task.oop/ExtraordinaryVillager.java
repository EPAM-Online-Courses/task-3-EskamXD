package efs.task.oop;

public class ExtraordinaryVillager extends Villager {
    public enum Skill {
        IDENTIFY("I will identify items for you at no charge."),
        SHELTER("I can offer you poor shelter.");

        // Field for description
        String description;

        // Constructor
        Skill(String description) {
            this.description = description;
        }
        // Getter
        public String getDescription() {
            return description;
        }
    }

    private Skill skill;

    public ExtraordinaryVillager(String name, int age, Skill skill) {
        super(name, age);
        this.skill = skill;
    }

    public Skill getSkill() {
        return skill;
    }

    @Override
    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old. " + skill.getDescription());
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit(0);    
    }

    @Override
    public void takeHit(int damage) {
        this.health = 0;
    }
}