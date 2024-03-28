Below is the Java translation of the provided Python code:

```java
import java.util.Scanner;

public class GraphMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();

        if (d == 1) {
            System.out.println(n * (n - 1) / 2);
        } else {
            System.out.println((n - 1) + (n - d - 1) * n - ((n - d - 1) * (n + d - 2) / 2));
        }

        scanner.close();
    }
}
```

Remember to handle inputs correctly in Java using a `Scanner` object, and use `System.out.println` for output. In Java, `/` division on integers truncates the result, mimicking the `//` behavior in Python for positive numbers.
