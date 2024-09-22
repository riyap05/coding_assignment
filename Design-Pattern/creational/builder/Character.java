package creational.builder;

public class Character {
    private String name;
    private int strength;
    private int speed;
    private String skill;

    public Character(String name, int strength, int speed, String skill) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", speed=" + speed +
                ", skill='" + skill + '\'' +
                '}';
    }
}
