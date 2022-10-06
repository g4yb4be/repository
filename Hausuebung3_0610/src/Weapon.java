import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Weapon implements Comparator {
    private String name;
    private CombatType combatType;
    private DamageType damageType;
    private int damage;
    private int speed;
    private int strength;
    private int value;

    public Weapon(String name, CombatType combatType, DamageType damageType, int damage, int speed, int strength, int value) throws FileNotFoundException {
        this.name = name;
        this.combatType = combatType;
        this.damageType = damageType;
        this.damage = damage;
        this.speed = speed;
        this.strength = strength;
        this.value = value;
    }


    @Override
    public int compare(Object o1, Object o2) {
        return o1.;
    }
}
