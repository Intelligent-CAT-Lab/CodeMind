Here is the equivalent Java code based on the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the input and splitting it by spaces.
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        if (A + B < C) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        
        scanner.close();
    }
}
```

This Java code snippet assumes that the inputs will be provided on one line, separated by spaces, similar to the Python code. The `Scanner` class is used for input, and integer values are extracted with `nextInt()`. The logic follows the Python sample, performing the check and printing accordingly. After the input is processed, the scanner is closed to avoid resource leaks.
