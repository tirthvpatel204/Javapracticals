public class CounterRace{
    static int counter=0;
    static synchronized void increaseCounter(){
        counter++;
    }
    public static void main(String[] args) throws Exception{
        Thread[] threads=new Thread[10];
        for(int i=0;i<10;i++){
            threads[i]=new Thread(()->{
                for(int j=0;j<10000;j++){
                    increaseCounter();
                }
            });
            threads[i].start();
        }
        for(Thread thread:threads){
            thread.join();
        }
        System.out.println("Expected: 100000");
        System.out.println("Actual: "+counter);
    }
}