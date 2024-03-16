Certainly! Here is the equivalent code translated into Java:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] s = input.toCharArray();
        Arrays.sort(s);
        
        if (s[0] == s[1] && s[2] == s[3] && s[0] != s[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

This Java code does the following:
1. It imports the necessary classes.
2. It reads a line of text from the standard input.
3. It converts the input string into a char array.
4. It sorts the char array.
5. It checks the sorted array for the condition given in the Python code and prints out the corresponding message.
