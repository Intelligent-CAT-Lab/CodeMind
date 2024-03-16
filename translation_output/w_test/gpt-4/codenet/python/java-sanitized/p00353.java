import java.util.Scanner;

public class p00353 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(); // existing number of product in stock
        int f = scanner.nextInt(); // number of products expected to arrive
        int b = scanner.nextInt(); // number of products needed to satisfy the order

        if (m + f < b) {
            System.out.println("NA");
        } else if (m >= b) {
            System.out.println("0");
        } else {
            System.out.println(b - m);
        }
        scanner.close();
    }
}