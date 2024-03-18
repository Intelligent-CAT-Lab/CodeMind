Here is the equivalent Java code for the provided sample Python code. It reads three integers as input, separated by spaces, checks if a variable `x` is between `a` and `a+b` (inclusive), and prints "YE" if the condition is true, or "NO" if it's false.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read space-separated integers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        
        // Check the condition and print "YE" or "NO"
        System.out.println((a <= x && a + b >= x) ? "YE" : "NO");
        
        scanner.close();
    }
}
```

To execute this Java code, you would typically compile it with a Java compiler (e.g., `javac Main.java`), and then run it using the Java runtime (e.g., `java Main`). Make sure you provide the input in the format specified (three integers separated by spaces) when the program prompts for it.
