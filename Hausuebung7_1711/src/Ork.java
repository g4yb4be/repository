import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ork implements Runnable {
    private ReentrantLock leftDagger;
    private ReentrantLock rightDagger;

    public Ork(ReentrantLock leftDagger, ReentrantLock rightDagger) {
        this.leftDagger = leftDagger;
        this.rightDagger = rightDagger;
    }

    public void drinking(){
        System.out.println("Ork drinks, time: " + System.currentTimeMillis());
        try {
            Thread.sleep((long) (Math.random() * 300));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void feasting(){
        System.out.println("Ork eats, time: " + System.currentTimeMillis());
        try {
            Thread.sleep((long) (Math.random() * 300));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        while(true){
            drinking();
            try {
                while(leftDagger.isLocked() || rightDagger.isLocked())
                leftDagger.lock();
                rightDagger.lock();
                feasting();
            } finally {
                leftDagger.unlock();
                rightDagger.unlock();
            }
        }
    }
}
