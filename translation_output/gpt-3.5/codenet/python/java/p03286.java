```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(System.console().readLine());
        if (N == 0) {
            System.out.println(0);
            return;
        }

        HashSet<Integer> l = new HashSet<>();
        while (N != 0) {
            int r;
            if (N > 0) {
                r = plus(N);
                l.add(r);
                N -= Math.pow(2, r);
            } else {
                r = minus(N);
                l.add(r);
                N += Math.pow(2, r);
            }
            
        }

        int maxLength = l.stream().max(Integer::compare).orElse(0) + 1;
        int[] s = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            if (l.contains(i)) {
                s[i] = 1;
            }
        }
        for (int i = maxLength - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }

    public static int plus(int N) {
        int p = 0;
        int n = 0;
        while (true) {
            p += Math.pow(2, n);
            if (p >= N) {
                break;
            }
            n += 2;
        }
        return n;
    }

    public static int minus(int N) {
        int p = 0;
        int n = 1;
        while (true) {
            p -= Math.pow(2, n);
            if (p <= N) {
                break;
            }
            n += 2;
        }
        return n;
    }
}
```
