Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int C = A + 1;
        int D = B + 1;
        int E = C + 1;
        int F = D + 1;

        int N = A;
        int M = B;

        if (N > M) {
            System.out.println(">");
        } else if (N == M) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, adds 1 to each, and then compares them. The result is printed to the console.
