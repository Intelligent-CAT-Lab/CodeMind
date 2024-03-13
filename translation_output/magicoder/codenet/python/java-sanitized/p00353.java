import java.util.Scanner;

public class p00353 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int f = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (m + f < b) {
            System.out.println("NA");
        } else if (m >= b) {
            System.out.println("0");
        } else {
            System.out.println(b - m);
        }
    }
}