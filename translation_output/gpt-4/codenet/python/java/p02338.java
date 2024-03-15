Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(N <= K ? 1 : 0);
        scanner.close();
    }
}
```

In Java, we use a `Scanner` object to take input from the user, similar to `input().split()` in Python. The ternary operator (`?:`) in Java works the same way as in Python. After using the `Scanner`, it's a good practice to close it to free up system resources. Java doesn't have an explicit "main" function like Python; instead, it has a `public static void main(String[] args)` method where execution starts.
