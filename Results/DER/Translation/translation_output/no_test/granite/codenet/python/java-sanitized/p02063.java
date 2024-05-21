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
        int _k = k;
        int n = 0;
        while (k < _k + 1000000) {
            int bn = k * A / B;
            int rem = k * A % B;
            int an = rem / A;
            rem = rem % A;
            n = bn + an + rem;
            if (n > k) {
                System.out.println(k * A);
                return;
            }
            k++;
        }
        System.out.println(-1);
    }
}