```java
import java.util.*;
import java.io.*;

public class Main {
    static final long mod = (long) 1e9 + 7;

    public static List<Pair> factorization(int n) {
        List<Pair> buff = new ArrayList<>();
        int x = 5;
        int m = n;
        int c;
        
        while (m >= x * x) {
            c = 0;
            while (m % x == 0) {
                c++;
                m /= x;
            }
            if (c > 0) {
                buff.add(new Pair(x, c));
            }
            if (x % 6 == 5) {
                x += 2;
            } else {
                x += 4;
            }
        }
        
        if (m > 1) {
            buff.add(new Pair(m, 1));
        }
        
        return buff;
    }

    public static long main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> d = new HashMap<>();
        
        for (int i = 1; i <= n; i++) {
            for (Pair pair : factorization(i)) {
                int key = pair.key;
                int value = pair.value;
                d.put(key, d.getOrDefault(key, 0) + value);
            }
        }

        long r = 1;
        for (int c : d.values()) {
            r *= c + 1;
            r %= mod;
        }
        
        return r;
    }

    public static void main(String[] args) {
        System.out.println(main());
    }

    static class Pair {
        int key;
        int value;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
```
Test input:
```
3
```

Expected output:
```
39
```
