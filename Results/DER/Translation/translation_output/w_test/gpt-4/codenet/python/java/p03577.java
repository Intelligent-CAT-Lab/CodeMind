Here's the Java code equivalent to the Python code provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.substring(0, input.length() - 8);
        System.out.println(output);
        scanner.close();
    }
}
```

To test with the provided input "CODEFESTIVAL", you would run the program and input that string when prompted. The Java program will output "CODE", as expected.
