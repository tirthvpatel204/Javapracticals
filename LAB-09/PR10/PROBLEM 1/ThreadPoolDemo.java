
import java.util.concurrent.*;
class ThreadPoolDemo{
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            int id = i;
            pool.submit(() -> {
                System.out.println("Task " + id + " running by " + Thread.currentThread().getName());
                try { Thread.sleep(200); } catch (Exception e) {}
            });
        }
        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("All tasks completed");
    }
}