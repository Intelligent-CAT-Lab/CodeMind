Here's the equivalent Java code for the provided Python code snippet:

```java
import java.util.Scanner;

public class GraphMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        if (d == 1) {
            System.out.println(n * (n - 1) / 2);
        } else {
            System.out.println((n - 1) + (n - d - 1) * n - ((n - d - 1) * (n + d - 2) / 2));
        }
    }
}

```

And the corresponding sample test case would be executed as follows:

```java
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class GraphMakingTest {
    public static void main(String[] args) {
        String input = "4 3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        GraphMaking.main(null); // Expected output: 3
    }
}
```
Note: When using this test case code, please make sure that the `GraphMaking` class is in the same package or properly imported if necessary. This test case code provides the input stream from the string "4 3", mimicking user input.
