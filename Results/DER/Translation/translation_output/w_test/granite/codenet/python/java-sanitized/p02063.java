import java.util.*;

public class p02063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if (B % A == 0) {
            System.out.println(-1);
            return;
        }

        int k = -(-B / A);

        for (int i = k; i < k + 1000000; i++) {
            int rem = i * A % B;
            int an = rem / A;
            int bn = i * A / B;
            int n = bn + an + rem;
            if (n > i) {
                System.out.println(i * A);
                return;
            }
        }
        System.out.println(-1);
    }
}