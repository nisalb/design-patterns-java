package dev.nisaldb.patterns.strategy.weapon;

import dev.nisaldb.patterns.strategy.weapon.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public String useWeapon() {
        return "BOW-AND-ARROW";
    }
}
