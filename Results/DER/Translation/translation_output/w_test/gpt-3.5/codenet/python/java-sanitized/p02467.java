import java.util.Scanner;
import java.util.ArrayList;

public class p02467 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(n + ": ");
        primeFactorization(n);
    }

    public static void primeFactorization(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        }

        ArrayList<Integer> res = new ArrayList<>();
        int lim = (int) Math.sqrt(n);

        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res.add(p);
                n /= p;
            }
        }

        if (n > 1) {
            res.add(n);
        }

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}