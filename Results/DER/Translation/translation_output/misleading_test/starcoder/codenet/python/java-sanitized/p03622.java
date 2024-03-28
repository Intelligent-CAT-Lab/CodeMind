import java.util.*;
public class p03622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = (int) Math.pow(8, 7);
        int m = M * 476 + 1;
        int[] f = new int[M];
        int[] g = new int[M];
        int i = 1;
        f[0] = 1;
        while (i < M) {
            f[i] = (f[i - 1] * i) % m;
            i++;
        }
        g[0] = 1;
        g[1] = 1;
        i = 2;
        while (i < M) {
            g[i] = (g[i - 1] * i) % m;
            i++;
        }
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int j = 1;
        int k = 1;
        int ans = 0;
        while (j <= B) {
            ans += k * f[A + B - j] * g[B - j];
            k = k * 2 % m;
            j++;
        }
        System.out.println(ans % m);
    }
}