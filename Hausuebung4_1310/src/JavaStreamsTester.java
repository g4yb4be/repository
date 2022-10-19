import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamsTester {
    public static void main(String[] args){
        List <String> strings = Arrays.asList(" ", "Allegra", " ", "Auto", "cool");
        List <Integer> numbers = Arrays.asList(22,2,222,33,3,333);

        System.out.println(getCountEmptyString(strings));
        System.out.println(getCountLength3(strings));
        deleteEmptyString(strings).forEach(System.out::println);
        System.out.println(getMergedString(strings, ";"));
        getSquares(numbers).forEach(System.out::println);
        System.out.println(getMax(numbers));
        System.out.println(getMin(numbers));
        System.out.println(getSum(numbers));
        System.out.println(getAverage(numbers));
    }

    private static int getCountEmptyString(List<String> strings){
        return strings.stream().filter(String::isEmpty).collect(Collectors.toList()).size();
    }

    private static int getCountLength3(List<String> strings){
        return strings.stream().filter(string -> string.length() == 3).collect(Collectors.toList()).size();
    }

    private static List<String> deleteEmptyString(List<String> strings){
        return strings.stream().filter(string -> string.length() >= 0).collect(Collectors.toList());
    }

    private static String getMergedString(List<String> strings,String seperator){
        return String.join(seperator, strings.stream().toArray(String[]::new));
    }

    private static List<Integer> getSquares(List<Integer> numbers){
        return numbers.stream().map(integer -> integer * integer).collect(Collectors.toList());
    }

    private static int getMax(List<Integer> numbers){
        return numbers.stream().max(Integer::compareTo).orElse(0);
    }

    private static int getMin(List<Integer> numbers){
        return numbers.stream().min(Integer::compareTo).orElse(0);
    }

    private static int getSum(List<Integer> numbers){
        return numbers.stream().mapToInt(Integer::new).sum();
    }

    private static int getAverage(List<Integer> numbers){
        return numbers.stream().mapToInt(Integer::new).sum() / numbers.size();
    }
}
