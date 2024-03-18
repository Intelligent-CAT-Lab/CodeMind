Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        
        System.out.println(count);
        scanner.close();
    }
}
```

When you run the Java program with the test input `111100`, the expected output will be `102`. The program reads a line of input from the user, counts the number of times the character '1' appears, and prints the result.
