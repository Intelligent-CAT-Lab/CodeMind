Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            ret += (i % 2) - (s.charAt(i) == 'p' ? 0 : 1);
        }
        System.out.println(ret);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. For each character, it checks if it is a 'p'. If it is, it adds 0 to the running total. If it isn't, it adds 1. The result is printed to the console.
