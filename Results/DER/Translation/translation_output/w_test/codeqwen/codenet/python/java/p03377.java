Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        if (a <= x && a + b >= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java program does the same thing as your Python code. It reads three integers from the user, checks if the first integer is less than or equal to the third integer and if the sum of the first and second integers is greater than or equal to the third integer. If the condition is true, it prints "YES", otherwise it prints "NO".
