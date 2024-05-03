Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result += '0';
            } else {
                i += 1;
                if (s.charAt(i) == '.') {
                    result += '1';
                } else {
                    result += '2';
                }
            }
            i += 1;
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, iterates over each character in the string, and checks if it is a dot. If it is, it adds a '0' to the result string. If it's not, it moves to the next character and checks if it's a dot. If it is, it adds a '1' to the result string. If it's not, it adds a '2' to the result string. Finally, it prints the result string.
