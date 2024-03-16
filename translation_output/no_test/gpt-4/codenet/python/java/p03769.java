Below is the Python code translated to Java. The Java solution defines equivalent functions as methods within a public class. For the calculation of factorial, it uses an `ArrayList` to simulate Python's dynamic arrays.

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Combinations {

    private static ArrayList<Long> fact = new ArrayList<>();

    static {
        // Precompute factorials.
        fact.add(1L); // fact is equivalent to the Python list 'fact'
        for (int i = 1; i <= 100; i++) {
            fact.add(fact.get(fact.size() - 1) * i);
        }
    }

    // Equivalent to Python's C function
    private static long C(int a, int b) {
        return fact.get(a) / (fact.get(b) * fact.get(a - b));
    }

    // Equivalent to Python's sC function
    private static long sC(int a, int b) {
        long ret = 0;
        for (int i = 0; i <= Math.min(b, a - b); i++) {
            ret += C(b, i) * C(a - b, i);
        }
        return ret;
    }

    // Equivalent to Python's calc function
    private static ArrayList<String> calc(int n, int k) {
        if (n <= 0) {
            return new ArrayList<>();
        }

        int i = 0;
        while ((1 << (i + 1)) - 1 <= n) {
            i++;
        }

        ArrayList<String> ret = new ArrayList<>();
        for (int j = 0; j <= i; j++) {
            ret.add(String.valueOf(k));
        }

        int rem = n - ((1 << i) - 1);
        int kk = k + 1;
        i++;
        int j = i / 2;

        while (j > 0) {
            while (true) {
                long tmp = sC(i, j);
                if (tmp <= rem) {
                    ret.add(j, String.valueOf(kk));
                    ret.add(String.valueOf(kk));
                    kk++;
                    rem -= tmp;
                } else {
                    break;
                }
            }
            j--;
        }

        ret.addAll(calc(rem, kk));
        return ret;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        ArrayList<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(String.join(" ", X));
    }
}
```

Here are the changes made to adapt the Python script to Java:

1. A `ArrayList<Long>` is used to store factorials similar to the Python list.
2. Java uses `long` to ensure that there's enough space to store large numbers, as Python automatically uses big integers.
3. Instead of `append`, we use the `add` method to add elements to the list.
4. In the `calc` method, the resulting `ArrayList` uses `String.valueOf` to convert integers to strings before adding them to the array list.
5. The `main` method includes a scanner to take input from the user as an equivalent to Python's `input()`.
6. The translated Java code includes type declarations and more verbose syntax characteristic of Java, such as typecasting and loop structures.
7. In Java, we have to close the `Scanner` after its use to prevent resource leaks.
