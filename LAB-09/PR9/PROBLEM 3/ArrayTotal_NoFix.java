public class ArrayTotal_NoFix{
    static long total=0;
    public static void main(String[] args) throws Exception{
        int[] numbers=new int[100000];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=1;
        }
        Thread[] threads=new Thread[4];
        int part=numbers.length/4;
        for(int i=0;i<4;i++){
            int start=i*part;
            int end=(i+1)*part;
            threads[i]=new Thread(()->{
                for(int j=start;j<end;j++){
                    total=total+numbers[j];
                }
            });
            threads[i].start();
        }
        for(Thread thread:threads){
            thread.join();
        }
        System.out.println("Expected: 100000");
        System.out.println("Actual: "+total);
    }
}