Here is the equivalent Java code that performs the same operation as the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        
        long ans = Math.max(Math.max(a * c, a * d), Math.max(b * c, b * d));
        System.out.println(ans);
        
        scanner.close();
    }
}
```

To run this with the provided test input:

```java
import java.io.ByteArrayInputStream;

public class TestMaxProduct {
    public static void main(String[] args) {
        String input = "418379342 802780784 -790013317 -445130206";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Main.main(args);
    }
}
```

When you run the `TestMaxProduct` class, it will simulate passing the test input of "418379342 802780784 -790013317 -445130206" to the main program and the expected output will be displayed, which should match the expected output of -186233282690604452.
