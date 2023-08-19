package dev.nisaldb.patterns.strategy.weapon;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public String useWeapon() {
        return "AXE";
    }
}
