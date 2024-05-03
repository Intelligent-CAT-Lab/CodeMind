Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int g = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);

        if ((g * 10 + b) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, then checks if the sum of the second and third integers (g and b) multiplied by 10 is divisible by 4. If it is, it prints "YES", otherwise it prints "NO".
