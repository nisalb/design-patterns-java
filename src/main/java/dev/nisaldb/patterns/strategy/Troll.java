package dev.nisaldb.patterns.strategy;

import dev.nisaldb.patterns.strategy.weapon.AxeBehavior;

public class Troll extends Character {
    public Troll(String name) {
        super(name + " the Troll", new AxeBehavior());
    }
}
