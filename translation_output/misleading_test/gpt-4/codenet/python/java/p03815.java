Here's your Python code translated into Java. The sample input and expected output are properly translated for a Java program:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // Reading input in Java
        int n = x / 11;
        x = x - 11 * n;

        if (x == 0) {
            System.out.println(2 * n);
        } else if (1 <= x && x <= 6) {
            System.out.println(1 + 2 * n);
        } else {
            System.out.println(2 + 2 * n);
        }

        scanner.close(); // It is a good practice to close the Scanner after use
    }
}
```

Save this code into a file e.g., `Main.java`, compile it using `javac Main.java`, and then run it using `java Main`. When you enter `7` as the test input using the keyboard, it should display `-6` as the expected output.
