Certainly! Below is the translation of the provided Python code into Java. We will assume that you will provide the input in the format specified (two numbers separated by a space) through the standard input (typically the console).

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        System.out.println(a * b);
    }
}
```

You can compile and run this Java program to get the expected output. When you input "5 8" as specified in the test case, the program will output "40" (5 multiplied by 8). Note that there was an error in your expected output, as 5 * 8 is actually 40, not 19.
