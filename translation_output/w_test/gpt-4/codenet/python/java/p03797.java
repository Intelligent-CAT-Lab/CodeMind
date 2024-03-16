Here's how you could translate the provided Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int c = scanner.nextInt();
        
        if (s * 2 <= c) {
            System.out.println(s + ((c - s * 2) / 4));
        } else {
            System.out.println(c / 2);
        }
    }
}
```

This Java code takes two integers as input and prints the output according to the provided logic. It first reads the input using a `Scanner` object, then checks the condition similar to the ternary operation in the python code and prints the result accordingly.
