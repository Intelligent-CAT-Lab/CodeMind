import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s == 1) {
            System.out.println(1);
            return;
        }
        List<Integer> lis = fact(s);
        Map<List<Integer>, Integer> f = new HashMap<>();
        Map<List<Integer>, Integer> p = new HashMap<>();
        Collections.sort(lis);
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    if (p.containsKey(Arrays.asList(a, b))) {
                        f.put(sum(a, b), f.getOrDefault(sum(a, b), 0) + 1);
                        p.put(Arrays.asList(a, b), 0);
                    }
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                if (p.containsKey(Arrays.asList(a, b))) {
                    int s_ = sum(a, b);
                    if (s_ > s) {
                        break;
                    }
                    f.put(s_, f.getOrDefault(s_, 0) + 1);
                    p.put(Arrays.asList(a, b), 0);
                }
            }
        }
        int ans = 0;
        for (int k : lis) {
            ans += f.getOrDefault(k, 0) * f.getOrDefault(s / k, 0);
        }
        System.out.println(ans);
        return;
    }

    public static List<Integer> fact(int n) {
        if (n < 4) {
            return Arrays.asList(1, n);