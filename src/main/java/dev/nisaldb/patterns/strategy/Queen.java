package dev.nisaldb.patterns.strategy;

import dev.nisaldb.patterns.strategy.weapon.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen(String name) {
        super("Queen " + name, new BowAndArrowBehavior());
    }
}
