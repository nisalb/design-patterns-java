package dev.nisaldb.patterns.strategy;

import dev.nisaldb.patterns.strategy.weapon.SwordBehavior;

public class Knight extends Character {
    public Knight(String name) {
        super("Sir " + name, new SwordBehavior());
    }
}
