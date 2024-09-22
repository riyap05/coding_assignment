package creational.builder;

public class MainBuilder {
    public static void main(String[] args) {
        Character character = new CharacterBuilder()
                .setName("Warrior")
                .setStrength(80)
                .setSpeed(60)
                .setSkill("Swordsmanship")
                .build();

        System.out.println(character);
    }
}
