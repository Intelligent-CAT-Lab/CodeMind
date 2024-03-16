import java.util.*;

public class p02012 {
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        List<Integer> lis = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Map<Integer, Integer> f = new HashMap<>();
        Map<Integer, Integer> p = new HashMap<>();
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    if (p.containsKey(new int[]{a, b})) {
                        f.put(sum(a, b), f.get(sum(a, b)) + 1);
                        p.put(new int[]{a, b}, 0);
                    }
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                if (p.containsKey(new int[]{a, b})) {
                    int s_ = sum(a, b);
                    if (s_ > s) {
                        break;
                    }
                    f.put(s_, f.get(s_) + 1);
                    p.put(new int[]{a, b}, 0);
                }
            }
        }
        int ans = 0;
        for (int k : lis) {
            ans += f.get(k) * f.get(s / k);
        }
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return ((b + a) * (b - a + 1)) >> 1;
    }

    static List<Integer> fact(int n) {
        if (n < 4) {
            return new ArrayList<>(Arrays.asList(1, n));
        }
        List<Integer> res = new ArrayList<>(Arrays.asList(1));
        int i = 2;
        while (i * i <= n) {
            if (n % i == 0) {
                res.add(i);
                int m = n / i;
                if (i != m) {
                    res.add(m);
                }
            }
            i++;
        }
        res.add(n);
        return res;
    }
}