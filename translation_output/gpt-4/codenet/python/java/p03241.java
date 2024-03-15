Below is the translated Java code that replicates the functionality of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> makeDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        // Collections.sort(divisors); // Sorting is not necessary for finding the max GCD
        return divisors;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        double MN = (double) M / N;
        List<Integer> divisors = makeDivisors(M);
        int maxGcd = 0;
        for (int d : divisors) {
            if (d <= MN && d >= maxGcd) {
                maxGcd = d;
            }
        }
        System.out.println(maxGcd);
    }
}
```

Some important points noted during the translation:

- Java uses the `Math.sqrt` function to calculate the square root, similar to `n**0.5` in Python.
- Type conversion and rounding are handled explicitly in Java, unlike Python which does it automatically.
- The `List` interface is used instead of a Python list, with an `ArrayList` as the implementation.
- Instead of `append`, Java uses `add` to add elements to a list.
- The `System.in` and `Scanner` are used for input instead of `input()`, and values are retrieved with the `nextInt()` method.
- Java requires variable types to be specified, so each variable and list element must have a declared type (e.g., `int`, `double`).
- In Java, the main method is the entry point of the program, eliminating the need for the `if __name__ == '__main__':` construct in Python.
- The loop to iterate over the divisors uses an enhanced for-loop in Java.
- Comments and code structure are adapted to follow Java's syntax and conventions.
