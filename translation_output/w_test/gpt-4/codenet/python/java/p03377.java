Here's the translated code from Python to Java. The input is read using `Scanner` and the condition is checked using an if-else statement:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();
        
        System.out.println((a <= x && a + b >= x) ? "YES" : "NO");
    }
}
```

To test the code with the input `3 5 4`, you would run the Java program and enter the numbers when prompted.

The program should output:
```
YES
```
