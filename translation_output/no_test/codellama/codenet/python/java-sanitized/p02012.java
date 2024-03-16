import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class p02012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s == 1) {
            System.out.println(1);
            return;
        }
        List<Integer> lis = getFactors(s);
        Map<Integer, Integer> f = new HashMap<>();
        Map<Integer, Integer> p = new HashMap<>();
        lis.sort(null);
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    if (p.get((a, b)) != null) {
                        f.put(sum(a, b), f.getOrDefault(sum(a, b), 0) + 1);
                        p.put((a, b), null);
                    }
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                if (p.get((a, b)) != null) {
                    int s_ = sum(a, b);
                    if (s_ > s) {
                        break;
                    }
                    f.put(s_, f.getOrDefault(s_, 0) + 1);
                    p.put((a, b), null);
                }
            }
        }
        int ans = 0;
        for (int k : lis) {
            ans += f.get(k) * f.get(s / k);
        }
        System.out.println(ans);
    }

    private static List<Integer> getFactors(int n) {
        List<Integer> res = new ArrayList<>();
        if (n < 4) {
            res.add(1);
            res.add(n);
            return res;
        }
        res.add(1);
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

    private static int sum(int a, int b) {
        return (b + a) * (b - a + 1) / 2;
    }
}