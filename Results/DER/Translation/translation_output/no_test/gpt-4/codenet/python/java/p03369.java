Certainly! The equivalent Java code for the given Python snippet, including collecting input from the user and printing the result, would be:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Read a string input from the user
        String s = scanner.nextLine();
        
        // Count the occurrences of "o" in the input string
        long countO = s.chars().filter(ch -> ch == 'o').count();
        
        // Calculate the result based on the count of "o"
        int result = 700 + (int) (100 * countO);
        
        // Print the result
        System.out.println(result);
        
        // Close the scanner
        scanner.close();
    }
}
```
Make sure to import the `Scanner` class at the beginning of your code to handle user input. The `Scanner` class is used in Java for many kinds of input operations, including reading strings from the console.

In the code, `s.chars()` creates an IntStream of char values from the string. The lambda expression `ch -> ch == 'o'` filters the stream to count only the characters that are 'o'. Then we cast the long count to an int since the number of 'o's should always be an integer and within the int range.

The `system.out.println` statement is used in Java to output the result to the console, similar to the `print` function in Python. After use, it's a good practice to close the scanner to release the resources it might be holding (though in the context of this small program, it won't make much of a difference).
