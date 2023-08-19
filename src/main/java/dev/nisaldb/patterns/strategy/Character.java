package dev.nisaldb.patterns.strategy;

import dev.nisaldb.patterns.strategy.weapon.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;

    protected final String name;

    protected Character(String name, WeaponBehavior weapon) {
        this.name = name;
        this.weaponBehavior = weapon;
    }

    public String fight() {
        return "I'm fighting with a " + weaponBehavior.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weaponBehavior = weapon;
    }

    public String sayName() {
        return "My name is " + name;
    }

}
