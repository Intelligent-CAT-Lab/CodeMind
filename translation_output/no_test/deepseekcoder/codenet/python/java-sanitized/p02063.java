import java.util.Scanner;

public class p02063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B % A == 0) {
            System.out.println(-1);
            System.exit(0);
        }

        int _k = (int) Math.ceil((double) B / A);

        for (int k = _k; k < _k + 10000000; k++) {
            int rem = k * A % B;
            int an = rem / A;
            int n = k + an + rem % A;
            if (n > k) {
                System.out.println(k * A);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}