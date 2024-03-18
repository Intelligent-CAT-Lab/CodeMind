To translate the provided Python code into Java, you will need to read the input from the command line or using a scanner instance, check if the number contains the digit '7', and then print the appropriate message. Here is the translation of the given code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();

        if (N.contains("7")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

And here's how you can compile and run the Java program with a sample test input of `117`:

```bash
javac Main.java  # Compile the Java program
echo 117 | java Main  # Run the program with input 117
```

The expected output would be `Yes`, as the number `117` contains the digit `7`.
