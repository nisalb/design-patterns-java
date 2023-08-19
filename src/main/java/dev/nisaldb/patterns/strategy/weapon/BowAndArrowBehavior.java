package dev.nisaldb.patterns.strategy.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public String useWeapon() {
        return "BOW-AND-ARROW";
    }
}
