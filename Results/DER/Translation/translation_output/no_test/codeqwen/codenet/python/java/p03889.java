Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] t = s.toCharArray();
        for (int i = 0; i < t.length; i++) {
            if (t[i] == 'p') {
                t[i] = 'q';
            } else if (t[i] == 'q') {
                t[i] = 'p';
            }
            if (t[i] == 'b') {
                t[i] = 'd';
            } else if (t[i] == 'd') {
                t[i] = 'b';
            }
        }
        String reversed = new String(t);
        String original = new String(s.toCharArray());
        String ans = original.equals(reversed) ? "Yes" : "No";
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, reverses it, and then checks if the reversed string is the same as the original string. If they are the same, it prints "Yes", otherwise it prints "No".
