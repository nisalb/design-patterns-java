package dev.nisaldb.patterns.strategy.weapon;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public String useWeapon() {
        return "KNIFE";
    }
}
