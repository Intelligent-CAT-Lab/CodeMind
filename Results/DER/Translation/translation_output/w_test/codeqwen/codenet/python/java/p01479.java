Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0, c = 0, p = 0;
        char b = ' ';
        String r = "";
        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    r = String.valueOf(b);
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += (s.charAt(i) == 'c') ? 3 : 7;
            c++;
        }
        if (c > p) {
            r = String.valueOf(b);
        }
        System.out.println((r.equals("e")) ? "egg" : "chicken");
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, counts the occurrences of 'e' and 'c', and then prints out "egg" if 'e' occurs more times, and "chicken" if 'c' occurs more times.
