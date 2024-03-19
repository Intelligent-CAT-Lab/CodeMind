import java.util.Scanner;

public class p00993 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long product = 1;
        for (int i = 1; i <= 1500; i++) {
            product *= i;
        }
        System.out.println(product + 2);

        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
    }
}