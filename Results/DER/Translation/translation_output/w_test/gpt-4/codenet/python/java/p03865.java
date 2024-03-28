Here is the equivalent Java code for the given Python code. It reads a string from the console input, checks the first and last characters, the length of the string, and prints "Second" or "First" based on the condition.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        String ans;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() % 2 != 0) {
                ans = "Second";
            } else {
                ans = "First";
            }
        } else {
            if (s.length() % 2 != 0) {
                ans = "First";
            } else {
                ans = "Second";
            }
        }
        System.out.println(ans);
    }
}
```
To run this Java code, you would need to have a Java environment set up with a JDK installed. You can compile and run the `Main` class, input "aba" when prompted, and you'll see the expected output "Second".
