Here is the Java translation of the given Python code along with a sample test case:

```java
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reads input from the user
        String input = scanner.nextLine();
        
        // Closes the scanner to prevent resource leaks
        scanner.close();
        
        // Create a StringBuilder instance with the input string
        StringBuilder reversedInput = new StringBuilder(input);
        
        // Reverse the string using the reverse() method
        reversedInput.reverse();
        
        // Print the reversed string
        System.out.println(reversedInput.toString());
    }
}
```

To compile and run the program you can save it in a file named `ReverseString.java`, then use the following commands in a terminal or command prompt:

```bash
javac ReverseString.java
java ReverseString
```

When you run the program, it will wait for you to enter the input (e.g., `w32nimda`). After entering the input and pressing `Enter`, it will output the reversed string (e.g., `jdo3n2Br`).

