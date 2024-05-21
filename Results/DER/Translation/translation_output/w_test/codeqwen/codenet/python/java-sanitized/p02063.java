import java.util.Scanner;

public class p02063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B % A == 0) {
            System.out.println(-1);
            return;
        }

        int _k = -(-B / A);

        for (int k = _k; k < _k + 10000000; k++) {
            int bn = k * A / B;
            int rem = k * A % B;
            int an = rem / A;
            int n = bn + an + rem;
            if (n > k) {
                System.out.println(k * A);
                return;
            }
        }
        System.out.println(-1);
    }
}