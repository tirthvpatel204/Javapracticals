class OutOfStockException extends Exception {
    OutOfStockException(String msg) {
        super(msg);
    }
}
class InvalidQuantityException extends Exception {
    InvalidQuantityException(String msg) {
        super(msg);
    }
}
class Warehouse {
    int stock=10;
    void issue(String item, int qty) throws OutOfStockException, InvalidQuantityException {
        if(qty<=0){
            throw new InvalidQuantityException("Invalid quantity");
        }
        if(qty>stock){
            throw new OutOfStockException("Not enough stock");
        }
        stock=stock-qty;
        System.out.println("Issued " + qty + " " + item);
    }
}
public class Main {
    public static void main(String[] args) {
        Warehouse w = new Warehouse();
        try {
            w.issue("Pen", 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            w.issue("Book", 15);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            w.issue("Pencil", 0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
