Here's the equivalent Java code for the Python code provided:

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
        scanner.close();
    }
}
```

The Java code presented above reads three integer inputs (X, Y, Z), performs the calculations to find the answer, and then prints out the result, which is analogous to the original Python code's functionality.
