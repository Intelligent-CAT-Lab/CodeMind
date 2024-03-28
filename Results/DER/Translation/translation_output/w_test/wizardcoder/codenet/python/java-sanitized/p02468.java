import java.util.*;

public class p02468 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mod = 1000000007;
        System.out.println(power(m, n, mod));
    }

    public static int power(int m, int n, int mod) {
        if (n == 0) {
            return 1;
        }
        int res = power(m, n / 2, mod);
        res = (res * res) % mod;
        if (n % 2 == 1) {
            res = (res * m) % mod;
        }
        return res;
    }
}