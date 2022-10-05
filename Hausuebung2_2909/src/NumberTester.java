import java.io.File;
import java.util.Scanner;

public class NumberTester {

    private NumberTester oddTester;
    private NumberTester primeTester;
    private NumberTester palindromeTester;

    Scanner scanner = new Scanner(System.in);

    public NumberTester(String fileName) {
    File file = new File(fileName);
    scanner.readFile;

    setOddEvenTester(number -> {
        System.out.println(number + " ist eine gerade Zahl");
        return number % 2 == 0;
    });

    setPrimeTester(number -> {
        for (int n = 2; n < Math.sqrt(number); n++)
        System.out.println(number + " ist eine Primzahl");
        return number % n == 0;
    });
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

    }
}
