Below is the Python code converted into Java. It includes the necessary imports, the `main` method to run the code, the `check` method, and the logic to calculate the length of the set:

```java
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    private static HashSet<Long> setl = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        setl.add(k);
        setl.add(k - 1);
        for (long x = 2; x <= Math.sqrt(k); x++) {
            check(x, k);
            check(k / x, k);
        }
        if (setl.contains(1L)) {
            setl.remove(1L);
        }
        System.out.println(setl.size());
        scanner.close();
    }

    public static void check(long i, long k) {
        long tot = k;
        while (tot % i == 0) {
            tot /= i;
        }
        if (tot % i == 1) {
            setl.add(i);
        }
    }
}
```

Here's how it works:
1. The code starts with importing the necessary Java classes.
2. It defines a `HashSet<Long>` to store the unique values as in the Python set.
3. The `main` method is the entry point for the Java program, and it's similar to running the Python code directly.
4. A `Scanner` is used to read the input from the standard input (typically the keyboard).
5. The code calls the `check` method similar to the Python function, adding values to the `setl` as necessary.
6. After checking all elements, if the set contains the value `1`, it is removed.
7. The size of the `setl` set is printed to the console, which is the expected output as in the Python code.

Remember that Java is strongly typed, so you must specify the type of the variables (`long` in this case), and when dealing with primitives or their wrapper classes (`Long`), you cannot use the `+=` shorthand to perform type conversion as you might in Python. This has been taken into account in the above Java code.
