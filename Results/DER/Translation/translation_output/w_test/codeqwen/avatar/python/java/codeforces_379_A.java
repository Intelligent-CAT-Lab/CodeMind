Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = a;
        int h = 0;
        int s = 0;
        while (x > 0) {
            x--;
            h++;
            s++;
        }
        while (s / b != 0) {
            h++;
            s = s - b + 1;
        }
        System.out.println(h);
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, performs the same operations as your Python code, and prints the result.
