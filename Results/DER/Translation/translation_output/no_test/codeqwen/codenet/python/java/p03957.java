Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder ss = new StringBuilder();
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (p == 0 && s.charAt(i) == 'C') {
                p = 1;
            } else if (p == 1 && s.charAt(i) == 'F') {
                p = 2;
            }
        }
        System.out.println(p == 2 ? "Yes" : "No");
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. If the current character is 'C' and the previous character was 'C', it sets `p` to 1. If the current character is 'F' and `p` is 1, it sets `p` to 2. Finally, it prints "Yes" if `p` is 2, otherwise it prints "No".
