import java.util.*;

public class p02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s == 1) {
            System.out.println(1);
            return;
        }
        List<Integer> lis = fact(s);
        Map<String, Integer> f = new HashMap<>();
        Map<String, Integer> p = new HashMap<>();
        Collections.sort(lis);
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    if (p.getOrDefault(a + "," + b, 0) == 1) {
                        f.put(a + "," + b, f.getOrDefault(a + "," + b, 0) + 1);
                        p.put(a + "," + b, 0);
                    }
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                if (p.getOrDefault(a + "," + b, 0) == 1) {
                    int s_ = a + b;
                    if (s_ > s) {
                        break;
                    }
                    f.put(a + "," + b, f.getOrDefault(a + "," + b, 0) + 1);
                    p.put(a + "," + b, 0);
                }
            }
        }
        int ans = 0;
        for (int k : lis) {
            ans += f.getOrDefault(k + "," + s / k, 0);
        }
        System.out.println(ans);
        return;
    }

    public static List<Integer> fact(int n) {
        if (n < 4) {
            return Arrays.asList(1, n);