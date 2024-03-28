Here is the equivalent Java code that performs the same operations as the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().toUpperCase();
        System.out.println(a);
        scanner.close();
    }
}
```

This code takes input from the user, converts it to uppercase, then prints it, similar to the Python version. Make sure to close the `Scanner` to prevent resource leaks.
