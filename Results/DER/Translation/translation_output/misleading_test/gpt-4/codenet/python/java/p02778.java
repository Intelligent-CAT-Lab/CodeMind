Below is the translated Python code to Java:

```java
import java.util.Scanner;

public class HideString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input string
        String s = scanner.nextLine();
        
        // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Replace each character of the input string with 'x'
        for (int i = 0; i < s.length(); i++) {
            result.append('x');
        }
        
        // Print the result
        System.out.println(result.toString());
        
        scanner.close();
    }
}
```

The code above takes a string input from the user and prints a string of 'x' characters with the same length as the input.

To test the Java code with the test input "sardine", you can compile and run the `HideString` class and input "sardine" (without quotes) when prompted. The expected output would be:

```
xxxxxxx
```
