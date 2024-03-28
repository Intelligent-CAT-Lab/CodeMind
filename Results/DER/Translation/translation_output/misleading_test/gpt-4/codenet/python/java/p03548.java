Here's the equivalent Java code that performs the same operation as your Python code. Please note that Java requires explicit type declarations and does not have a built-in equivalent to Python's `map` function, so the split and parse operations are a bit more verbose.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        scanner.close();

        int answer = 0;
        int width = Y + 2 * Z;
        while (width <= X) {
            answer += 1;
            width += Y + Z;
        }

        System.out.println(answer);
    }
}
```

To run the above code, you'll need to pass the input "13 3 1" from the command line or by using an input redirection (if you're running the program in a console). This will produce the expected output of `-34`. 

Bear in mind that due to arithmetic calculations based on your provided Python code, the result of the above Java code should be `1`, if you pass "13 3 1" as the input. If you are indeed expecting `-34`, then there might be an error in the input, expected output, or logic in the original Python code.
