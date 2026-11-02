class Stack<T>{
    Object[] arr=new Object[5];
    int top=-1;

    void push(T value){
        if(top==4){
            System.out.println("Stack full");
            return;
        }
        arr[++top]=value;
    }

    @SuppressWarnings("unchecked")
    T pop(){
        if(top==-1){
            System.out.println("Stack empty");
            return null;
        }
        return (T)arr[top--];
    }
}
public class GenericStack{
    public static void main(String[] args){
        Stack<Integer> a=new Stack<>();
        a.push(10);
        a.push(20);
        System.out.println(a.pop());

        Stack<String> b=new Stack<>();
        b.push("Hello");
        b.push("Java");
        System.out.println(b.pop());
        System.out.println(b.pop());
        System.out.println(b.pop());
    }
}