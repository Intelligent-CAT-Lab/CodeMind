Below is the translated code from Python to Java, which includes a `main` method as the entry point for the program. You'll need to compile and run this Java program for it to accept an input and produce the expected output.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("ABC" + s);
        scanner.close();
    }
}
```

To use the Java code, you should follow these steps:
1. Save the code into a file named `Main.java`.
2. Compile the code with the Java compiler (`javac Main.java`).
3. Run the compiled class with Java (`java Main`).

When you run the program, you can enter `100` (or another number) as the input and expect the output to be `ABC100`.
