import java.util.*;

public class p03830 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (int k : factorization(i)) {
                d.put(k, d.getOrDefault(k, 0) + 1);
            }
        }
        int r = 1;
        for (int c : d.values()) {
            r = (r * (c + 1)) % 1000000007;
        }
        System.out.println(r);
    }

    public static List<Integer> factorization(int n) {
        List<Integer> res = new ArrayList<>();
        while (n % 2 == 0) {
            res.add(2);
            n /= 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                res.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            res.add(n);
        }
        return res;
    }
}