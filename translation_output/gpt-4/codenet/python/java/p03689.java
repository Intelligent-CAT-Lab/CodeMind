Here is the translation of the Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int h = scanner.nextInt();
        int w = scanner.nextInt();

        if (H % h == 0 && W % w == 0) {
            System.out.println("No");
        } else if (W % w != 0) {
            System.out.println("Yes");
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if (x != 0) System.out.print(" ");
                    if (x % w != w - 1) {
                        System.out.print(100000);
                    } else {
                        System.out.print(-100000 * (w - 1) - 1);
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Yes");
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if (x != 0) System.out.print(" ");
                    if (y % h != h - 1) {
                        System.out.print(100000);
                    } else {
                        System.out.print(-100000 * (h - 1) - 1);
                    }
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
```

A few notes on the Java version:

1. In Java, we need to explicitly import the `Scanner` class for reading user input from the `System.in` input stream.
2. The syntax for defining variables and reading integers from the input stream is different in Java. 
3. I used `System.out.print` and `System.out.println` for console output in Java, as there is no native 'print' function like in Python.
4. In Java, every application needs to have at least one class definition and a main method (`public static void main(String[] args)`) to start the execution of the program.

Make sure that you have properly handled the input (e.g., spaces and newlines after each number) as expected in Java, as it might be different than Python's input expectations. Java's print statements don't add newlines or spaces automatically.
