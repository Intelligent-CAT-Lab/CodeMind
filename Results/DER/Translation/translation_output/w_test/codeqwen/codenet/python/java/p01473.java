Here is the Java version of your Python code:

```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int lS = S.length();
        Map<Character, Integer> d = new HashMap<>();
        for (char c : S.toCharArray()) {
            d.put(c, d.getOrDefault(c, 0) + 1);
        }
        int dd = 0;
        for (int i : d.values()) {
            if (i % 2 != 0) {
                dd++;
            }
        }
        if ((lS % 2 == 0 && dd != 0) || (lS % 2 == 1 && dd != 1)) {
            System.out.println(0);
        } else {
            BigInteger dnm = BigInteger.ONE;
            for (int i : d.values()) {
                dnm = dnm.multiply(BigInteger.valueOf(f(i / 2)));
            }
            System.out.println(f(lS / 2).divide(dnm));
        }
    }

    public static int f(int n) {
        if (n == 0) {
            return 1;
        }
        return n * f(n - 1);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, counts the frequency of each character in the string, and then calculates the number of characters with odd counts. If the length of the string is even and there are odd counts, or if the length is odd and there are not exactly one odd count, it prints 0. Otherwise, it calculates the factorial of half the length of the string and divides it by the product of the factorials of half the counts of each character.
