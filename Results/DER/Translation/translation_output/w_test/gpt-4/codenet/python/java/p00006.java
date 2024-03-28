Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
        scanner.close();
    }
}
```

The provided Python code snippet takes input from the user, reverses the string using slicing with `[::-1]`, and prints it out. The translated Java code does something similar by using the `StringBuilder` class to reverse the string and then print it.

Remember to provide an input to the program when you run it, just as with the Python script. For example, if you provide "w32nimda" as an input when prompted by the Java program, it will output "admin23w" as expected.
