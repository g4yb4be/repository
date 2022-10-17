import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class GaußscheSummenformel {
    static Scanner scanner = new Scanner(System.in, "UTF-8");
    int finalSum = 0;

    public static void main(String[] args){
        GaußscheSummenformel m = new GaußscheSummenformel();
        m.beispiel2();
    }

    public void beispiel2(){
        System.out.println("n> ");
        int n = Integer.parseInt(scanner.nextLine());
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(n/100);
        threadPoolExecutor.execute(() -> addSum((n * n + n)/2));

        threadPoolExecutor.shutdown();
        System.out.println("Sum: " + finalSum);
    }
    public void addSum(int sum) {
        finalSum += sum;
    }
}
