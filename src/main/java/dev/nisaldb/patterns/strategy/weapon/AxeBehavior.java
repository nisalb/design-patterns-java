package dev.nisaldb.patterns.strategy.weapon;

import dev.nisaldb.patterns.strategy.weapon.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public String useWeapon() {
        return "AXE";
    }
}
