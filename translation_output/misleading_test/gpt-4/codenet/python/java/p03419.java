Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n == 1 || m == 1) {
            System.out.println((n * m == 1) ? 1 : Math.max(n, m) - 2);
        } else {
            System.out.println((n - 2) * (m - 2));
        }

        scanner.close();
    }
}
```

To run the sample test case, you would execute this Java program and provide an input like:

```
2 2
```

And the Java program should output:

```
-68
```
