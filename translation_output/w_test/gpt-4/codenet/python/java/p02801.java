Here's the Java equivalent of the Python code provided:

```java
import java.util.Scanner;

public class NextLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char c = input.charAt(0);
        
        if(c >= 'a' && c < 'z') {
            char nextLetter = (char) (c + 1);
            System.out.println(nextLetter);
        } else if(c == 'z') { // Wrap around case 'z' -> 'a'
            System.out.println('a');
        } else {
            System.out.println("Invalid input"); // If the character is not in a-z
        }
        
        scanner.close();
    }
}
```

If you run this Java program with the test input 'a', the output will be 'b', which matches the expected output.
