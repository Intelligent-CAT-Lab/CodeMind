Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = x / 11;
        x = x - 11 * n;

        if (x == 0) {
            System.out.println(2 * n);
        } else if (1 <= x && x <= 6) {
            System.out.println(1 + 2 * n);
        } else {
            System.out.println(2 + 2 * n);
        }
    }
}
```

Please note that this Java program must be run in an environment that can accept user input, like a console or an integrated development environment (IDE).

To run the test case, you would input "7" when prompted, and the program would print the expected output "2".
