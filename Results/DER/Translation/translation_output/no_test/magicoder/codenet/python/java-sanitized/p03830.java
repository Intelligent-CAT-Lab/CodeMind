import java.util.*;
import java.math.*;

public class p03830 {
    static final int MOD = 1000000007;
    static final int INF = (int)1e20;

    static int[] factorization(int n) {
        int[] buff = new int[n+1];
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                buff[i]++;
                n /= i;
            }
        }
        return buff;
    }

    static int main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n+1];
        for (int i = 1; i <= n; i++) {
            int[] f = factorization(i);
            for (int j = 0; j < f.length; j++) {
                d[j] += f[j];
            }
        }
        long r = 1;
        for (int c : d) {
            r *= c+1;
            r %= MOD;
        }
        return (int)r;
    }

    public static void main(String[] args) {
        System.out.println(main());
    }
}