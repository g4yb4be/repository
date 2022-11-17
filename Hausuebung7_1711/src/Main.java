import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock fork1 = new ReentrantLock();
        ReentrantLock fork2 = new ReentrantLock();
        ReentrantLock fork3 = new ReentrantLock();
        ReentrantLock fork4 = new ReentrantLock();
        ReentrantLock fork5 = new ReentrantLock();

        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        threadPoolExecutor.execute(new Ork(fork1, fork2));
        threadPoolExecutor.execute(new Ork(fork2, fork3));
        threadPoolExecutor.execute(new Ork(fork3, fork4));
        threadPoolExecutor.execute(new Ork(fork4, fork5));
        threadPoolExecutor.execute(new Ork(fork5, fork1));
    }
}