Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        System.out.println(A + B);
        scanner.close();
    }
}
```

This Java code performs the same functionality as the given Python code, which is reading two integers from the standard input separated by a space, and then printing their sum to the standard output.
