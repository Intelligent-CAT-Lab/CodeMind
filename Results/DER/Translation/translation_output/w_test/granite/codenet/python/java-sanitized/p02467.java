import java.util.Scanner;

public class p02467 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n + ": ");
        printPrimeFactors(n);
    }

    public static void printPrimeFactors(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        }

        int lim = (int) Math.sqrt(n);
        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                System.out.print(p + " ");
                n /= p;
            }
        }

        if (n > 1) {
            System.out.print(n);
        }
    }
}