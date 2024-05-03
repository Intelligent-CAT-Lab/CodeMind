Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        int answer = 0;
        int width = Y + 2 * Z;
        while (width <= X) {
            answer++;
            width += Y + Z;
        }

        System.out.println(answer);
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, calculates the answer, and prints it out. The `Scanner` class is used to read the input from the user. The `nextInt()` method is used to read an integer from the user. The `System.out.println()` method is used to print the answer to the console.
