In Java, obtaining user input and working with strings and arrays is a bit more verbose than in Python. Here is how you can translate the given Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        scanner.close();
        
        System.out.println(Math.max((Character.getNumericValue(n.charAt(0)) - 1) + 9 * (n.length() - 1), sumOfDigits(n)));
    }
    
    private static int sumOfDigits(String str) {
        int sum = 0;
        for(char c : str.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
```

Here's what the code does:

1. Import the `Scanner` class to read input from the console.
2. Define the `Main` class and the `main` method which is the entry point to a Java program.
3. Create a new `Scanner` instance to get user input and read the line input as a string.
4. Close the scanner to avoid resource leaks.
5. Compute the first part of the `max` method's parameters: `Character.getNumericValue(n.charAt(0)) - 1 + 9 * (n.length() - 1)`. It converts the first character of the input string to its numeric value, subtracts 1, then adds 9 times the length of the string minus 1.
6. Call the `sumOfDigits` method which sums up all the digits of the input string.

   - This method converts the input string to a character array, iterates over the characters, converts each to its numeric value, and accumulates the sum.
7. Use `System.out.println` to print out the maximum of the two computed values.
