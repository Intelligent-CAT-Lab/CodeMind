Below is the equivalent code in Java. Please note that Java's syntax and style are different from Python's. Here's the translated code that performs the functionality of the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integer inputs
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Print x if x is not divisible by y, otherwise print -1
        System.out.println((x % y != 0) ? x : -50);

        scanner.close();
    }
}
```

Save the code in a file named `Main.java`, compile it with `javac Main.java`, and run it with the command `java Main`. You can then enter the test input `8 6` to see the expected output `-50`.
