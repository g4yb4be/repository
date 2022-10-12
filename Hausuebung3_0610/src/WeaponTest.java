import java.util.ArrayList;
import java.util.Collections;

class WeaponTest {

    public ArrayList<Weapon> w1;
    public ArrayList<Weapon> w2;

    @org.junit.jupiter.api.Test
    void sortByDmg() {
        Collections.sort(w2, Weapon.sortByDmg());
        assert !w1.equals(w2);

    }

    @org.junit.jupiter.api.Test
    void sortByAlphabet() {
        Collections.sort(w2, Weapon.sortByAlphabet());
        assert !w1.equals(w2);
    }
}