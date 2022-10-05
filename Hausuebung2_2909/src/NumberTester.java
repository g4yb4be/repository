import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberTester {

    private NumberTester oddTester;
    private NumberTester primeTester;
    private NumberTester palindromeTester;

    Scanner scanner = new Scanner(System.in);
    File file;
    ArrayList<String> arrayList;

    public void readFile() throws FileNotFoundException {
        scanner = new Scanner(file);
        arrayList = new ArrayList<>(List.of(scanner.nextLine().split(" ")));

        while (scanner.hasNext()){
            arrayList.addAll(List.of(scanner.nextLine().split(" ")));
        }
    }


    public NumberTester(String fileName) {
     file = new File(fileName);
    scanner.readFile();

    setOddEvenTester(number -> {
        System.out.println(number + " ist eine gerade Zahl");
        return number % 2 == 0;
    });

    setPrimeTester(number -> {
        for (int n = 2; n < Math.sqrt(number); n++)
        System.out.println(number + " ist eine Primzahl");
        return number % n == 0;
    });

    setPalindromeTester(//?);

    testFile();
    }

    public void setOddEvenTester(NumberTester oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTester primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTester palindromeTester){
        this.palindromeTester = palindromeTester;
    }

    public void testFile(){
        for (String line : arrayList) {
            String[] split = line.split(",");

            if (split[0].equals("1")) {

                } else {

                }
            

        }
    }
}
