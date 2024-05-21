import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        List<long[]> factors = factorization(x);
        factors.sort(Comparator.comparingLong(a -> a[0]));
        long ans = 0;
        for (long[] factor : factors) {
            if (factor[0] == 1) {
                continue;
            } else {
                long s = 0;
                long num = factor[1];
                long j = 1;
                while (s < num) {
                    s += j;
                    if (s == num) {
                        break;
                    } else if (s > num) {
                        j--;
                        break;
                    }
                }
                ans += j;
            }
        }
        System.out.println(ans);
    }

    public static List<long[]> factorization(long n) {
        List<long[]> arr = new ArrayList<>();
        long temp = n;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                long cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(new long[]{i, cnt});
            }
        }
        if (temp!= 1) {
            arr.add(new long[]{temp, 1});
        }
        if (arr.isEmpty()) {
            arr.add(new long[]{n, 1});
        }
        return arr;
    }
}