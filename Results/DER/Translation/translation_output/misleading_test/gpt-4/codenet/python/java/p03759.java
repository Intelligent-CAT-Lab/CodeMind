Below is the translated code from Python to Java. The Java code uses a Scanner to read from standard input and to parse the integers.

```java
import java.util.Scanner;

public class SequenceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (b - a == c - b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
```

To run a test case with the input `2 4 6`, the expected output would be `YES`, given that the difference between consecutive numbers is the same (4 - 2 = 6 - 4).
