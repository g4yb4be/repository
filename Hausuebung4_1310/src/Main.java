import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ReadCSV readCSV = new ReadCSV();
    private static ArrayList<Integer> list;
    private static File csvFile = new File("numbers.csv");
    static Scanner scanner = new Scanner(System.in, "UTF-8");
    static {
        try {
            list = (ArrayList<Integer>) readCSV.readCSV(csvFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("chunks>");
        int chunks = Integer.parseInt(scanner.nextLine());
        System.out.println("divider>");
        int divider = Integer.parseInt(scanner.nextLine());



    }


}