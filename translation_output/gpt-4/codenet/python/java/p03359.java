Sure, here's the equivalent Java code for the Python snippet you provided. I've included comments to explain the parts of the code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Read the entire line as a string
        String line = scanner.nextLine().trim();
        
        // Split the line by space to get individual strings
        String[] numbers = line.split(" ");
        
        // Convert strings to integers
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        
        // Close the scanner
        scanner.close();
        
        // Condition check and print the result
        if (a > b) {
            System.out.println(a - 1);
        } else {
            System.out.println(a);
        }
    }
}
```

This Java program does the same thing as the Python code. It reads two integers from the same line, separates them by their whitespace, processes them based on the condition given, and finally prints the result to the console.
