import java.util.Scanner;

public class VendingMachine {

    enum Coin {
        ONE, TWO, FIVE, TEN
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int snackPrice = 15;
        int total = 0;

        while (total < snackPrice) {

            System.out.println("Enter Coin (ONE, TWO, FIVE, TEN): ");
            Coin coin = Coin.valueOf(sc.next().toUpperCase());

            switch (coin) {
                case ONE:
                    total += 1;
                    break;

                case TWO:
                    total += 2;
                    break;

                case FIVE:
                    total += 5;
                    break;

                case TEN:
                    total += 10;
                    break;
            }

            System.out.println("Total = " + total);
        }

        System.out.println("Paid.");
        System.out.println("Change = " + (total - snackPrice));

        sc.close();
    }
}