package creational.builder;

public class CharacterBuilder {
    private String name;
    private int strength;
    private int speed;
    private String skill;

    public CharacterBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CharacterBuilder setStrength(int strength) {
        this.strength = strength;
        return this;
    }

    public CharacterBuilder setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public CharacterBuilder setSkill(String skill) {
        this.skill = skill;
        return this;
    }

    public Character build() {
        return new Character(name, strength, speed, skill);
    }
}
