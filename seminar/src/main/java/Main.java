import java.util.ArrayList;
import java.util.List;

interface CharacterInterface {
    void step();
    String getInfo();
}

// Абстрактный класс, реализующий интерфейс
abstract class BaseHero implements CharacterInterface {
    protected String name;
    protected int health;
    protected int speed;

    public BaseHero(String name, int health, int speed) {
        this.name = name;
        this.health = health;
        this.speed = speed;
    }

    public void step() {
        System.out.println(name + " делает шаг!");
    }
}

// Класс, описывающий крестьянина
class Peasant extends BaseHero {
    public Peasant(String name, int health, int speed) {
        super(name, health, speed);
    }

    public String getInfo() {
        return "Крестьянин";
    }
}

// Класс, описывающий разбойника
class Rogue extends BaseHero {
    public Rogue(String name, int health, int speed) {
        super(name, health, speed);
    }

    public String getInfo() {
        return "Разбойник";
    }
}

// Класс, описывающий снайпера
class Sniper extends BaseHero {
    public Sniper(String name, int health, int speed) {
        super(name, health, speed);
    }

    public String getInfo() {
        return "Снайпер";
    }
}

// Класс, описывающий колдуна
class Warlock extends BaseHero {
    public Warlock(String name, int health, int speed) {
        super(name, health, speed);
    }

    public String getInfo() {
        return "Колдун";
    }
}

// Класс, описывающий копейщика
class Spearman extends BaseHero {
    public Spearman(String name, int health, int speed) {
        super(name, health, speed);
    }

    public String getInfo() {
        return "Копейщик";
    }
}

// Класс, описывающий арбалетчика
class Crossbowman extends BaseHero {
    public Crossbowman(String name, int health, int speed) {
        super(name, health, speed);
    }

    public String getInfo() {
        return "Арбалетчик";
    }
}

// Класс, описывающий монаха
class Monk extends BaseHero {
    public Monk(String name, int health, int speed) {
        super(name, health, speed);
    }

    public String getInfo() {
        return "Монах";
    }
}

public class Main {
    public static void main(String[] args) {
        List<CharacterInterface> heroes1 = new ArrayList<>();
        List<CharacterInterface> heroes2 = new ArrayList<>();

        // Добавление по 10 экземпляров наследников BaseHero в каждый список
        for (int i = 1; i <= 10; i++) {
            heroes1.add(new Peasant("Крестьянин " + i, 100, 5));
            heroes2.add(new Rogue("Разбойник " + i, 150, 10));
            heroes2.add(new Sniper("Снайпер " + i, 120, 8));
            heroes2.add(new Warlock("Колдун " + i, 80, 6));
            heroes2.add(new Spearman("Копейщик " + i, 130, 7));
            heroes2.add(new Crossbowman("Арбалетчик " + i, 110, 7));
            heroes2.add(new Monk("Монах " + i, 90, 5));
        }

        // Вызов метода getInfo у всех персонажей
        for (CharacterInterface hero : heroes1) {
            System.out.println(hero.getInfo());
        }
        for (CharacterInterface hero : heroes2) {
            System.out.println(hero.getInfo());
        }
    }
}
