Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder t = new StringBuilder(s);
        t.reverse();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == 'p') {
                t.setCharAt(i, 'q');
            } else if (c == 'q') {
                t.setCharAt(i, 'p');
            } else if (c == 'b') {
                t.setCharAt(i, 'd');
            } else if (c == 'd') {
                t.setCharAt(i, 'b');
            }
        }
        String ans = s.equals(t.toString()) ? "Yes" : "No";
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, reverses it, and then swaps 'p' with 'q' and 'b' with 'd'. If the original string is equal to the reversed string, it prints "Yes", otherwise it prints "No".
