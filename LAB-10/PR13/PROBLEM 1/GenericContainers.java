class Box<T>{
    T value;
    void set(T value){
        this.value=value;
    }
    T get(){
        return value;
    }
}
class Pair<A,B>{
    A first;
    B second;
    Pair(A first,B second){
        this.first=first;
        this.second=second;
    }
    void show(){
        System.out.println(first+" "+second);
    }
}
public class GenericContainers{
    static <T>T first(T[] arr){
        return arr[0];
    }
    public static void main(String[] args){
        Box<Integer> b=new Box<>();
        b.set(10);
        System.out.println(b.get());
        Box<String> s=new Box<>();
        s.set("Hello");
        System.out.println(s.get());
        Pair<String,Integer> p=new Pair<>("Tirth",20);
        p.show();
        Integer[] a={10,20,30};
        System.out.println(first(a));
    }
}