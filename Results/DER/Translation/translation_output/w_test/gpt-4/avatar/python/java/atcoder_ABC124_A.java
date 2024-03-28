Below is the equivalent Java code that performs the same logic as the provided Python code. The code reads two integers, summates the larger number twice (while decrementing it each time after it is added), and then prints the result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();  // Close the scanner as it's no longer needed.
        int c = 0;

        for (int i = 0; i < 2; i++) {
            c += Math.max(a, b);
            if (a >= b) {
                a -= 1;
            } else {
                b -= 1;
            }
        }

        System.out.println(c);
    }
}
```

Make sure to use this code within a class (here named `Main` as it's conventional in Java), and you must import the `Scanner` class to read from standard input. In the code above, I properly close the `Scanner` after it's no longer needed, to avoid resource leaks.

To compile and run the code, save it to a file named `Main.java`, then execute the following commands in your terminal:

```sh
javac Main.java
java Main
```

You can then provide the input (e.g., "6 6") to get the output "12".
