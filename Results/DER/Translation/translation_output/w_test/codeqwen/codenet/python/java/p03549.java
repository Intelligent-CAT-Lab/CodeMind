Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int total = 1900 * M + 100 * (N - M);
        System.out.println(total * (1 << M));
    }
}
```

In Java, we use `<<` operator for left shift, which is equivalent to `2 ** M` in Python. Also, Java uses `System.out.println()` for printing output.
