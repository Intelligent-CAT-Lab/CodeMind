Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        if (sorted.charAt(0) == sorted.charAt(1) && sorted.charAt(2) == sorted.charAt(3) && sorted.charAt(0) != sorted.charAt(2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, sorts the characters in the line, and then checks if the first two characters are the same, the second two characters are the same, and the first character is not the same as the second character. If all these conditions are met, it prints "Yes"; otherwise, it prints "No".
