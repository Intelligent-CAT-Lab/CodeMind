Below is the equivalent Java code for the provided Python code:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaseNegativeTwoConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        if (N == 0) {
            System.out.println("0");
            return;
        }
        
        Set<Integer> l = new HashSet<>();
        while (N != 0) {
            if (N > 0) {
                int r = plus(N);
                l.add(r);
                N -= Math.pow(2, r);
            } else {
                int r = minus(N);
                l.add(r);
                N += Math.pow(2, r);
            }
        }
        
        int maxIndex = l.stream().max(Integer::compareTo).orElse(0);
        int[] s = new int[maxIndex + 1];
        
        for (int i = 0; i <= maxIndex; ++i) {
            if (l.contains(i)) {
                s[i] = 1;
            }
        }
        
        StringBuilder result = new StringBuilder();
        for(int i = s.length - 1; i >= 0; --i) {
            result.append(s[i]);
        }
        
        System.out.println(result.toString());
    }
    
    private static int plus(int N) {
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
    
    private static int minus(int N) {
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

This Java program defines a `BaseNegativeTwoConverter` class with three methods: the `main` method to run the conversion, and the `plus` and `minus` methods that perform calculations similar to their Python counterparts. This code expects input through standard input (such as the console). It does not handle the printing of how the numbers are produced in base -2, as those comments in the original Python code have been left disabled by the commented out block. If that is needed, you can uncomment and convert the Python code within that block to Java as well.
