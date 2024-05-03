Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(-(-N/2.0)/N);
    }
}
```

In Java, the `//` operator performs integer division, which means it will discard the decimal part of the division. To get the decimal part, we need to use `/` operator instead. Therefore, we use `-(-N/2.0)` to get the same result as in Python.
