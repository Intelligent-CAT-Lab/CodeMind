Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder a = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (i == 'B') {
                if (a.length() > 0) {
                    a.deleteCharAt(a.length() - 1);
                }
            } else {
                a.append(i);
            }
        }
        System.out.println(a.toString());
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. If the character is 'B', it deletes the last character in the StringBuilder `a`. If the character is not 'B', it appends the character to the StringBuilder `a`. Finally, it prints the contents of the StringBuilder `a`.
