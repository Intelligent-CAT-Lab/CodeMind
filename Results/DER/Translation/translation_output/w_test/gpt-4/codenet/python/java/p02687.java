Below is the translated Java code for the given Python code snippet. Note that in Java, you need to import a Scanner class for taking input from the user, and instead of `print`, you use `System.out.println` to output to the console.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next(); // Taking a string input from the user

        if (string.equals("ARC")) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
        
        scanner.close(); // Close the scanner resource
    }
}
```
To run this code, you need to have a Java environment set up. Then, you can compile and run the `Main` class, input "ABC" when prompted, and the program will output "ARC".
