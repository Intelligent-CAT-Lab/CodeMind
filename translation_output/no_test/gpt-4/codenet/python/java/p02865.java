Here's the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n - 1) / 2);
        scanner.close();
    }
}
```

In Java, we need to import the `Scanner` class to read input from the user. We then create an instance of Scanner to read an integer value. After calculating `(n - 1) / 2`, we print the result to the console. Finally, it's good practice to close the `Scanner` when it's no longer needed.
