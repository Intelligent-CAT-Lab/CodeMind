import java.util.*;

public class p03622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = (int) Math.pow(8, 7);
        int m, f, g, i;
        m = M * 476 + 1;
        f = 1;
        g = new int[M];
        Arrays.fill(g, 1);
        i = 0;
        while (i < M) {
            f += f * i % m;
            i++;
        }
        g[0] = g[1] = 1;
        for (int j = 2; j < M; j++) {
            g[j] = g[j - 1] * j % m;
        }
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        if (A < B) {
            A = B;
            B = A;
        }
        int result = 0;
        for (int j = 0; j <= B; j++) {
            result += k * f[A + B - j] * g[B - j];
            k = k * 2 % m;
        }
        System.out.println((result * f[B] * g[A + B] + A) % m);
    }
}