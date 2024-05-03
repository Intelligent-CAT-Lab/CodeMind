Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println(b - a);
        } else {
            System.out.println(a - b);
        }
        scanner.close();
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then checks if the first integer is less than the second. If it is, it prints the difference between the two integers. If the first integer is not less than the second, it prints the difference between the second and the first integer.
