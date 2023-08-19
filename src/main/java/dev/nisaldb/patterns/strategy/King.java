package dev.nisaldb.patterns.strategy;

import dev.nisaldb.patterns.strategy.weapon.KnifeBehavior;

public class King extends Character {
    public King(String name) {
        super("King " + name, new KnifeBehavior());
    }
}
