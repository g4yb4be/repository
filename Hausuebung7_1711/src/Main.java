import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock fork1 = new ReentrantLock();
        ReentrantLock fork2 = new ReentrantLock();
        ReentrantLock fork3 = new ReentrantLock();
        ReentrantLock fork4 = new ReentrantLock();
        ReentrantLock fork5 = new ReentrantLock();

        Ork ork1 = new Ork(fork1, fork2);
        Ork ork2 = new Ork(fork3, fork4);
        Ork ork3 = new Ork(fork, fork);
        Ork ork4 = new Ork(fork, fork);
        Ork ork5 = new Ork(fork, fork);

    }
}