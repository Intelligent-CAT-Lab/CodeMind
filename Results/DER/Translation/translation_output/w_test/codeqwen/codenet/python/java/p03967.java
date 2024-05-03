Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            ret += (i % 2) - (s.charAt(i) == 'p' ? 1 : 0);
        }
        System.out.println(ret);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. For each character, it checks if it is a 'p'. If it is, it adds 1 to the `ret` variable. If it isn't, it subtracts 1 from `ret`. Finally, it prints out the value of `ret`.
