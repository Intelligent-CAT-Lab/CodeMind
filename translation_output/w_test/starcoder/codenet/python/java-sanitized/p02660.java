import java.util.*;

public class p02660 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = primeFactorize(n);
        if (res.length == 1) {
            System.out.println(1);
        } else {
            int cnt = 0;
            int c = -1;
            int p = 0;
            Set<Integer> l = new HashSet<>();
            for (int r : res) {
                if (c == r) {
                    p += 1;
                    if (!l.contains(p)) {
                        l.add(p);
                        p = 0;
                        cnt += 1;
                    }
                } else {
                    l.clear();
                    p = 0;
                    l.add(1);
                    cnt += 1;
                    c = r;
                }
            }
            System.out.println(cnt);
        }
    }

    public static int[] primeFactorize(int n) {
        List<Integer> res = new ArrayList<>();
        while (n % 2 == 0) {
            res.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                res.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n!= 1) {
            res.add(n);
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}