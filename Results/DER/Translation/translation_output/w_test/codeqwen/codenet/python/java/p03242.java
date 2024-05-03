Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.nextLine();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < moji.length(); i++) {
            ans.append(moji.charAt(i) == '1' ? '9' : '1');
        }
        System.out.println(ans.toString());
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. If the character is '1', it appends '9' to the `StringBuilder` object `ans`, otherwise it appends '1'. Finally, it prints the contents of `ans` as a string.
