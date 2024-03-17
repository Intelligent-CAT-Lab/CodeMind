import java.util.*;

public class p02900 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int gcd = gcd(A, B);
        int[] prime_factor = prime_factorize(gcd);
        int ans = prime_factor.length;
        for (int i = 0; i < (1 << prime_factor.length); i++) {
            int i_temp = i;
            int j = 0;
            int composite = 1;
            int count = 0;
            while (i_temp != 0) {
                if (i_temp % 2 == 0) {
                    pass;
                } else if (i_temp % 2 == 1) {
                    composite *= prime_factor[j];
                    count += 1;
                }
                j += 1;
                i_temp /= 2;
            }
            for (int j = 0; j < prime_factor.length; j++) {
                if (prime_factor[j] == composite && count >= 2) {
                    ans -= 1;
                }
            }
        }
        System.out.println(ans + 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int[] prime_factorize(int n) {
        List<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        int[] ans = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            ans[i] = a.get(i);
        }
        return ans;
    }
}