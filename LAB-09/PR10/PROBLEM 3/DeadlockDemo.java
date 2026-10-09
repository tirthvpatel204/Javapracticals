class DeadlockDemo {
    static Object lock1 = new Object();
    static Object lock2 = new Object();
    static void useLocks(String name) {
        synchronized (lock1) {
            System.out.println(name + " locked lock1");
            synchronized (lock2) {
                System.out.println(name + " locked lock2");
            }
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> useLocks("Thread 1"));
        Thread t2 = new Thread(() -> useLocks("Thread 2"));
        t1.start();
        t2.start();
    }
}