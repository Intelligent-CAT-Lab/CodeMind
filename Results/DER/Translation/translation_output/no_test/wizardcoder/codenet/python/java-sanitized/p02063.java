import java.util.*;

public class p02063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (B % A == 0) {
            System.out.println(-1);
            return;
        }

        int k = -(-B / A);

        for (int i = k; i <= k + 10000000; i++) {
            int bn = i * A / B;
            int rem = i * A % B;
            int an = rem / A;
            int n = bn + an + rem % A;
            if (n > i) {
                System.out.println(i * A);
                return;
            }
        }
        System.out.println(-1);
    }
}