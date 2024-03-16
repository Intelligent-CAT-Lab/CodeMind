Below is the translated version of your provided Python code into Java:

```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Set<Integer> a = new HashSet<>();
        for (int i = 0; i < M; i++) {
            a.add(scanner.nextInt());
        }
        int num = N - M;
        int ans = 0;
        while (num > 0) {
            ans += 1;
            num -= 1;
        }
        System.out.println(ans - 1);
        scanner.close();
    }
}
```

This Java code assumes that the inputs are provided in the same format as your Python code's test case, i.e., first the N and M values on one line, followed by M lines of integer inputs for set a. However, note that the original Python code didn't use the `a` list, so I've included it in the Java translation as a `Set<Integer>` in case you want to utilize it later, but keep in mind that this set is currently not affecting the calculation of `ans`. 

Since Java requires a class and a `main` method as entry points, I wrapped the logic in a class called `TestClass` and included importing `java.util.Scanner` for reading from standard input as well as `java.util.HashSet` and `java.util.Set` for storing non-repeated values as in a Python set.
