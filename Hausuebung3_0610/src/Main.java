import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {
    private static ArrayList<Weapon> list;
    public static void main(String[] args) {
        list.sort(Weapon.sortByAlphabet());
        Printable printable = weapons -> {
            weapons.forEach(weapon -> System.out.println(weapon));
        };
        printable.print(list);

        final Predicate<Integer> isEven = integer -> (integer % 2)==0;
        final IntPredicate isPositive = value -> value > 0;
        final Predicate<String> isNull = string -> string == null;
        final IntPredicate is0 = integer -> integer == 0;
        final Predicate<String> isShortWord = string -> string.length() <= 4;

        System.out.println("2 isEven :"+isEven.test(2));
        System.out.println("99 isEven :"+isEven.test(99));

        System.out.println("22 isPositive :"+isPositive.test(22));
        System.out.println("-22 isPositive :"+isPositive.test(-22));

        System.out.println("'word' isShortWord :"+isShortWord.test("word"));
        System.out.println("'words' isShortWord :"+isShortWord.test("words"));

        System.out.println("'null' isNull :"+isNull.test("null"));
        System.out.println("'words' isNull :"+isNull.test("words"));

        System.out.println("'0' is0 :"+is0.test(Integer.parseInt("0")));
        System.out.println("'22' is0 :"+is0.test(Integer.parseInt("22")));

    }
}