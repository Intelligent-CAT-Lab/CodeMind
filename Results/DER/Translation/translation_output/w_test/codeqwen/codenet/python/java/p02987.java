Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        
        if(chars[0] == chars[1] && chars[1] == chars[2] && chars[2] == chars[3]) {
            System.out.println("No");
        } else if(chars[0] == chars[1] && chars[1] == chars[3] || chars[0] == chars[2] && chars[2] == chars[3] || chars[1] == chars[2] && chars[2] == chars[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, converts it to a character array, and then checks if any of the characters are the same. If they are, it prints "Yes". If not, it prints "No".
