
import java.util.*;
class main{
    static Queue<Integer> buffer=new LinkedList<>();
    static int size=3;
    static boolean finished=false;
    static synchronized void produce(int num) throws InterruptedException{
        while(buffer.size()==size){
            main.class.wait();
        }
        buffer.add(num);
        System.out.println("Produced: "+num);
        main.class.notifyAll();
    }
    static synchronized void consume() throws InterruptedException{
        while(buffer.isEmpty()&&!finished){
            main.class.wait();
        }
        if(!buffer.isEmpty()){
            System.out.println("Consumed: "+buffer.remove());
            main.class.notifyAll();
        }
    }
    public static void main(String[] args) throws InterruptedException{
        Thread producer=new Thread(()->{
            try{
                for(int i=1;i<=5;i++){
                    produce(i);
                }
                synchronized(main.class){
                    finished=true;
                    main.class.notifyAll();
                }
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });
        Thread consumer=new Thread(()->{
            try{
                for(int i=1;i<=5;i++){
                    consume();
                }
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}