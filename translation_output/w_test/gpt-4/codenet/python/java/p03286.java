Here is the Python code translated into Java code:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NegativeBaseConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        System.out.println(convertToNegabinary(N));
    }

    public static String convertToNegabinary(int N) {
        if (N == 0) {
            return "0";
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
        
        int maxBit = l.stream().max(Integer::compareTo).get();
        int[] s = new int[maxBit + 1];
        for (int i = 0; i <= maxBit; i++) {
            if (l.contains(i)) {
                s[i] = 1;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = maxBit; i >= 0; i--) {
            result.append(s[i]);
        }

        return result.toString();
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

Save this code in a file named `NegativeBaseConversion.java`, compile it with `javac NegativeBaseConversion.java` and run it using `java NegativeBaseConversion` command. When prompted, input `-9` for your test case, and it should output `1011`, as expected.
