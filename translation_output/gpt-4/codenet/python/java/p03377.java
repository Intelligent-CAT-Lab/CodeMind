Certainly! Here is the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        
        if (a <= x && a + b >= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
```

The Java code uses the `Scanner` class for input and uses a simple if-else statement to check the condition and prints the result accordingly.
