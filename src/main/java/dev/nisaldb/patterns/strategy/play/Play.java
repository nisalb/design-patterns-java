package dev.nisaldb.patterns.strategy.play;

import dev.nisaldb.patterns.strategy.*;
import dev.nisaldb.patterns.strategy.Character;

public class Play {
    public static void main(String[] args) {
        Character king = new King("Arthur");
        Character queen = new Queen("Anna");
        Character knight = new Knight("James");
        Character troll = new Troll("Ugogo");

        introduceCharacter(king);
        introduceCharacter(queen);
        introduceCharacter(knight);
        introduceCharacter(troll);
    }

    private static void introduceCharacter(Character character) {
        System.out.printf("%s\n\tand %s%n", character.sayName(), character.fight());
    }
}
