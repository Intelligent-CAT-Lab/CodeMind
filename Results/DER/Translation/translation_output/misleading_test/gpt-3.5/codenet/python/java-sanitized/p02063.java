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

        int _k = -(-B / A);

        for (int k = _k; k < _k + 10_000_000; k++) {
            int[] divmod1 = divmod(k * A, B);
            int bn = divmod1[0];
            int rem1 = divmod1[1];
            int[] divmod2 = divmod(rem1, A);
            int an = divmod2[0];
            int rem2 = divmod2[1];
            int n = bn + an + rem2;
            if (n > k) {
                System.out.println(k * A);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }

    public static int[] divmod(int a, int b) {
        int[] result = new int[2];
        result[0] = a / b;
        result[1] = a % b;
        return result;
    }
}