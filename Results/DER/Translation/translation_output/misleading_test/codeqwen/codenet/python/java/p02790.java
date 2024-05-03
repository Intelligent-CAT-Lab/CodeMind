Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a <= b) {
            System.out.println(String.valueOf(a).repeat(b));
        } else {
            System.out.println(String.valueOf(b).repeat(a));
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then checks if the first integer is less than or equal to the second. If it is, it prints the first integer repeated the number of times specified by the second integer. If the first integer is greater than the second, it prints the second integer repeated the number of times specified by the first integer.
