Here's the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (Math.abs(b - c) % 2 == 0) {
            System.out.println("Alice");
        } else {
            System.out.println("Borys");
        }
        
        scanner.close();
    }
}
```
Please note that Java is a statically typed language, so each variable must have a defined type at compile time. Additionally, Java requires that this code be located inside a class, so I have included an enclosing `Main` class. I also added input using the `Scanner` class to read three integers from the standard input, similar to how the Python code reads and splits input data. Finally, I use the `System.out.println()` method to print output to the console.
