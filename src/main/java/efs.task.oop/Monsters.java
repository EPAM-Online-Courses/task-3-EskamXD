package efs.task.oop;

public class Monsters {
    static final Monster andariel = new Monster(10, 70) {
        @Override
        public void takeHit(int damage) {
            health -= damage;
            monstersHealth -= damage;
        }

        @Override
        public void attack(Fighter victim) {
            victim.takeHit(andariel.getDamage());
        }
    };
    static final Monster blacksmith = new Monster(100, 25) {
        @Override
        public void takeHit(int damage) {
            health -= 5 + damage;
            monstersHealth -= 5 + damage;
        }

        @Override
        public void attack(Fighter victim) {
            victim.takeHit(blacksmith.getDamage());
        }
    };

    public static int monstersHealth = andariel.health + blacksmith.health;
}