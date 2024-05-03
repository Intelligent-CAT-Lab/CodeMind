Here is the Java version of your Python code:

```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int lS = S.length();
        Set<Character> set = new HashSet<>();
        for (char c : S.toCharArray()) {
            set.add(c);
        }
        int[] d = new int[set.size()];
        int i = 0;
        for (char c : set) {
            d[i++] = (int) S.chars().filter(ch -> ch == c).count();
        }
        int dd = 0;
        for (int j : d) {
            if (j % 2 != 0) {
                dd++;
            }
        }
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            BigInteger dnm = BigInteger.ONE;
            for (int j : d) {
                dnm = dnm.multiply(BigInteger.valueOf(factorial(j / 2)));
            }
            System.out.println(factorial(lS / 2).divide(dnm));
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
```

Please note that the `factorial` function is implemented recursively in Java. This is because Java does not have a built-in factorial function. If you want to use a more efficient factorial function, you can use the `BigInteger` class's `multiply` and `divide` methods.
