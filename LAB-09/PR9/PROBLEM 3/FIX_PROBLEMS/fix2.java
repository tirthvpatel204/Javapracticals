public class fix2{
    public static void main(String[] args) throws Exception{
        int[] numbers=new int[100000];
        long[] threadTotals=new long[4];
        Thread[] threads=new Thread[4];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=1;
        }
        int part=numbers.length/4;
        for(int i=0;i<4;i++){
            int threadNumber=i;
            int start=i*part;
            int end=(i+1)*part;
            threads[i]=new Thread(()->{
                long myTotal=0;
                for(int j=start;j<end;j++){
                    myTotal=myTotal+numbers[j];
                }
                threadTotals[threadNumber]=myTotal;
            });
            threads[i].start();
        }
        for(Thread thread:threads){
            thread.join();
        }
        long total=0;
        for(long value:threadTotals){
            total=total+value;
        }
        System.out.println("Expected: 100000");
        System.out.println("Actual: "+total);
    }
}