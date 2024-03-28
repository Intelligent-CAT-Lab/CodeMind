Here is the translated Java code from the provided Python code. I've made the equivalent Java functions and logic as required:

```java
import java.util.*;

public class Main {
    public static final int mod = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        solve(s);
    }
    
    public static long sum(int a, int b) {
        return ((b + (long)a) * (b - a + 1)) >> 1;
    }

    public static List<Integer> fact(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        if (n < 4) {
            res.add(n);
            return res;
        }
        
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

    public static void solve(int s) {
        if (s == 1) {
            System.out.println(1);
            return;
        }

        List<Integer> lis = fact(s);
        Map<Integer, Integer> f = new HashMap<>();
        Map<String, Integer> p = new HashMap<>();
        Collections.sort(lis);
        
        for (int k : lis) {
            for (int a = 1; a <= k; a++) {
                int b = k - a;
                if (a <= b) {
                    String key = a + "," + b;
                    if (p.getOrDefault(key, 1) == 1) {
                        f.put((int)sum(a, b), f.getOrDefault((int)sum(a, b), 0) + 1);
                        p.put(key, 0);
                    }
                }
            }
            for (int a = 1; a <= s; a++) {
                int b = k + a - 1;
                String key = a + "," + b;
                if (p.getOrDefault(key, 1) == 1) {
                    int s_ = (int)sum(a, b);
                    if (s_ > s) {
                        break;
                    }
                    f.put(s_, f.getOrDefault(s_, 0) + 1);
                    p.put(key, 0);
                }
            }
        }
        
        int ans = 0;
        for (int k : lis) {
            ans += f.getOrDefault(k, 0) * f.getOrDefault(s / k, 0);
        }
        System.out.println(ans);
    }
}
```

This Java main class expects the input number from the standard input and provides output on the standard output. To run this in a similar manner to the Python code, you could feed input to the Java program from the command line or from an input file.
