package dev.nisaldb.patterns.strategy.weapon;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public String useWeapon() {
        return "SWORD";
    }
}
