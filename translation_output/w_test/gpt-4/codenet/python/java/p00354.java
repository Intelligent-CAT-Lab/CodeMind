Certainly! Below is the Python code translated into Java. I've created a `Scanner` instance to handle input, and used array indexing in a similar way as the Python code. Since Java does not support printing arrays using the `print` function as Python does, I've used `System.out.println()` to print the elements at the proper index.

```java
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.close(); // Close the scanner to prevent resource leaks

        String[] Day = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        int a = X % 7;
        
        if (a == 2 || a == 3) {
            System.out.println(Day[a + 3]);
        } else if (a == 4 || a == 5 || a == 6) {
            System.out.println(Day[a - 4]);
        } else if (a == 0 || a == 1) {
            System.out.println(Day[a + 3]);
        }
    }
}
```

To compile and run this Java program, follow these steps:

1. Save the code in a file called `DayOfWeek.java`.
2. Compile the Java program using the `javac DayOfWeek.java` command in your terminal or command prompt.
3. Run the compiled class with `java DayOfWeek`, and enter `1` when prompted for input.
4. The output should be `fri`, matching the expected output.
