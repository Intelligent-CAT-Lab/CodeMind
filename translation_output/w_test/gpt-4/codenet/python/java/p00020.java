Here is the translated Python code into Java, including enclosing the solution within ```java``` markdown:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input string
        String a = scanner.nextLine();

        // Convert to uppercase
        a = a.toUpperCase();

        // Print the converted string
        System.out.println(a);

        scanner.close();
    }
}
```

To use this code in a Java environment, you need to save it as a `Main.java` file, then compile and run it. When you provide the input "this is a pen.", it will output "THIS IS A PEN." as expected.
