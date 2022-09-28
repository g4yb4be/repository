import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private static boolean[] prime;
    private static int maximum;
    private static ArrayList<Integer> primeList;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl Primzahlen: ");
        EratosthenesPrimeSieve primesieve = new EratosthenesPrimeSieve(Integer.parseInt(scanner.nextLine()));
    }
    public EratosthenesPrimeSieve(int maximum) {
        this.maximum = maximum; maximum++;
        prime = new boolean[maximum];
        primeList = new ArrayList<>();

        isPrime(maximum);
        printPrimes();
    }

    public static boolean isPrime(int p) {
        //p = this.maximum;
        prime = new boolean[p + 1];
        if (p <= 2) {
            return false;
        }

        boolean prime[] = new boolean[p + 1];
        Arrays.fill(prime, true);

        for (int i = 2; i * i <= p; i++) {
            if (prime[i]) {
                for (int j = i; j * i <= p; j++) {
                    prime[j * i] = false;
                }
            }

            for (int a = 0; a <= p; a++) {
                if (prime[a]) {
                    primeList.add(a);
                }
            }
        }
    }

    @Override
    public void printPrimes() {
        for(int p : primeList) {
            System.out.println(p + ", ");
        }
    }
}
