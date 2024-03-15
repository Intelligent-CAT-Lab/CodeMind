Here's the equivalent Java code:

```java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> res = primeFactorize(n);

        if (res.size() == 1) {
            System.out.println(1);
        } else {
            int cnt = 0;
            Integer c = null;
            int p = 0;
            Set<Integer> l = new HashSet<>();

            for (int r : res) {
                if (c != null && c.equals(r)) {
                    p += 1;
                    if (!l.contains(p)) {
                        l.add(p);
                        p = 0;
                        cnt += 1;
                    }
                } else {
                    l.clear();
                    p = 0;
                    l.add(1);
                    cnt += 1;
                    c = r;
                }
            }

            System.out.println(cnt);
        }

        scanner.close();
    }

    public static ArrayList<Integer> primeFactorize(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }
}
```

Note these key points in adapting the code from Python to Java:

- Java is a statically-typed language, so we have to define the types for each variable.
- Instead of Python's list, we use Java's `ArrayList` to store the prime factors.
- In Java, we typically use a `Scanner` object to read input from the user via the command line.
- Instead of Python's `set`, we use Java's `HashSet` to store unique counts of powers.
- Java requires that all the executable code must be placed inside a class, and the entry point of the application is the `main` method.

Make sure to import the necessary packages(`ArrayList`, `HashSet`, `Scanner`, and `Set`) at the beginning of the file.
