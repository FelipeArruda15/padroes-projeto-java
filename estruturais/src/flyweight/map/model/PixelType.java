package model;

public class PixelType {

    private char character;
    private int treasureReward;

    public PixelType(char character, int treasureReward) {
        this.character = character;
        this.treasureReward = treasureReward;
    }

    public char getCharacter() {
        return character;
    }

    public int getTreasureReward() {
        return treasureReward;
    }

}
