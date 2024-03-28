Below is the translated code from Python to Java that performs the same functionality. Note that in Java, the input is usually taken through command-line arguments or by using a Scanner object if using standard input. Here, I am implementing the latter, which is more akin to the way it is done in the provided Python code.

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the input similar to the Python code
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        if (n % k == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

        scanner.close();
    }
}
```

You would compile and run this Java program, then provide the input "7 3" (without quotes) when prompted. The expected output, "1", should be printed to the console.

Remember that Java requires a class name to match the file name for public classes. When you save this code, make sure the filename is `Main.java` unless you change the `Main` class name to match your filename.
