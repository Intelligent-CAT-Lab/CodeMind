Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.close();
        System.out.println((t / a) * b);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, performs the division and multiplication as in the Python code, and then prints the result. The `Scanner` class is used to read the input from the user. The `close()` method is called to close the `Scanner` object to free up system resources.
