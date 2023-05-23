package efs.task.oop;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Villager villagers[] = {
            new Villager("Kashya", 30),
            new Villager("Gheed", 50),
            new Villager("Warriv", 35),
            new Villager("Flawia", 25),
            new Villager("Akara", 40),
            new Villager("Deckard Cain", 85)};

        villagers[4] = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        villagers[5] = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);

        for (Villager villager : villagers) {
            villager.sayHello();
        }

        Object objectDeckardCain = villagers[5];
        Object objectAkara = villagers[4];

        // objectAkara.sayHello();

        Monster monsters[] = {
            Monsters.andariel,
            Monsters.blacksmith
        };

        while (Monsters.monstersHealth > 0) {
            Villager choosedVillager = (Villager) villagers[(int) (Math.random() * villagers.length)];
            Monster choosedMonster = (Monster) monsters[(int) (Math.random() * monsters.length)];

            System.out.println("Potwory posiadaja jeszcze " + Monsters.monstersHealth);
            System.out.println("Aktualnie walczacy osadnik to " + choosedVillager.name);

            choosedVillager.attack(choosedMonster);
            choosedMonster.attack(choosedVillager);

            villagers = Stream.of(villagers).filter(v -> v.health > 0).toArray(Villager[]::new);
            monsters = Stream.of(monsters).filter(m -> m.health > 0).toArray(Monster[]::new);

        }

        System.out.println("Obozowisko ocalone!");

        ExtraordinaryVillager dekardCain = (ExtraordinaryVillager) objectDeckardCain;
        ExtraordinaryVillager akara = (ExtraordinaryVillager) objectAkara;
        
        akara.sayHello();
    }
}