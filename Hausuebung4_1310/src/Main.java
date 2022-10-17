import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    private static ReadCSV readCSV = new ReadCSV();
    private static ArrayList<Integer> intsList;
    private static File csvFile = new File("numbers.csv");
    static Scanner scanner = new Scanner(System.in, "UTF-8");
    static {
        try {
            intsList = (ArrayList<Integer>) readCSV.readCSV(csvFile);
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
        ThreadPoolExecutor executer = (ThreadPoolExecutor) Executors.newFixedThreadPool(chunks);
        List<Integer> finalList = new ArrayList<>();

        int chunksSize = intsList.size() / chunks;
        for(int i = 0; i < intsList.size(); i+=chunksSize){
            if(i + chunksSize < intsList.size()){
                finalList = intsList.subList(i, i + chunksSize);
            }else{
                finalList = intsList.subList(i, intsList.size());
            }
        }

        List<Integer> finalList1 = finalList;
        executer.execute(() -> { finalList1.stream().forEach(integer -> {
                if(integer == null) return;
                if (integer % divider == 0)
                    System.out.println(integer);
            });
        });
        executer.shutdown();
    }
}