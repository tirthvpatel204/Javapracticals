public class SeatBooking_Sych{
    static int seatsLeft=5;
    static synchronized boolean bookSeat(){
        if(seatsLeft>0){
            seatsLeft--;
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws Exception{
        Thread[] threads=new Thread[10];
        int[] booked=new int[1];
        for(int i=0;i<10;i++){
            threads[i]=new Thread(()->{
                if(bookSeat()){
                    synchronized(booked){
                        booked[0]++;
                    }
                }
            });
            threads[i].start();
        }
        for(Thread thread:threads){
            thread.join();
        }
        System.out.println("Seats Booked: "+booked[0]);
        System.out.println("Seats Left: "+seatsLeft);
    }
}