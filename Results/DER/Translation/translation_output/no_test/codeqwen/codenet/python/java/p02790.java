Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        if (a <= b) {
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
        } else {
            for (int i = 0; i < a; i++) {
                System.out.print(b);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, then prints out the smaller integer repeated the number of times equal to the larger integer. If the first integer is larger than the second, it prints out the second integer repeated the number of times equal to the first integer.
