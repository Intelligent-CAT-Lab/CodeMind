import java.util.Scanner;

public class p02063 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        if (B % A == 0) {
            System.out.println(-1);
            return;
        }

        int _k = (B + A - 1) / A; // equivalent to ceil division in Python

        for (int k = _k; k < _k + Math.pow(10, 7); k++) {
            int bn = (k * A) / B;
            int rem = (k * A) % B;
            int an = rem / A;
            rem = rem % A;
            int n = bn + an + rem;
            if (n > k) {
                System.out.println(k * A);
                return;
            }
        }

        System.out.println(-1);
    }
}