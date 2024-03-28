import java.util.*;

public class p03420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int s = 0;
        for (int b = K+1; b <= N; b++) {
            int an = 0;
            int j = N / b;
            an = j * (b - K);
            if (N % b > 0) {
                int x1 = j * b + K;
                if (K == 0) x1 += 1;
                int x2 = Math.min(N, (j+1) * b - 1);
                if (x2 >= x1) an += (x2 - x1 + 1);
            }
            s += an;
        }
        System.out.println(s);
    }
}