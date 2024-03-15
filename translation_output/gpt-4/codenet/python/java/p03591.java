Here's the equivalent Java code that performs the same function:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        
        if (S.startsWith("YAKI")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

This Java program assumes that the input is provided in the same way as the Python example, where the input is given through the standard input (command line). The `startsWith` method is used to check if the string starts with the specified prefix "YAKI". If it does, "Yes" is printed; otherwise, "No" is printed.
