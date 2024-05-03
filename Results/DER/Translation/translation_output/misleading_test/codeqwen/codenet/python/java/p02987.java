Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        
        boolean flag = false;
        if(chars[0] == chars[1] && chars[1] == chars[2] && chars[2] == chars[3]) {
            flag = true;
        } else if(chars[0] == chars[1] && chars[1] == chars[3]) {
            flag = true;
        } else if(chars[0] == chars[2] && chars[2] == chars[3]) {
            flag = true;
        } else if(chars[1] == chars[2] && chars[2] == chars[3]) {
            flag = true;
        }
        
        if(flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, converts it to a character array, and then checks if any of the four characters are the same. If they are, it sets the `flag` variable to `true`. Finally, it prints "Yes" if `flag` is `true` and "No" otherwise.
