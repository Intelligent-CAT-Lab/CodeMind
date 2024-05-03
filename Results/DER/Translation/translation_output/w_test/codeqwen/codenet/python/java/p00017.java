Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < 26; i++) {
            if (s.contains("the") || s.contains("that") || s.contains("this")) {
                System.out.println(s);
                break;
            }
            s = decode(s);
        }
    }

    public static String decode(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ' && c != '.') {
                result.append((char) (c + 1));
            } else {
                result.append(c);
            }
        }
        return result.toString().replace((char) (122 + 1), 'a');
    }
}
```

This Java code does the same thing as your Python code. It reads a line from the standard input, decodes it, and checks if the decoded string contains the words "the", "that", or "this". If it does, it prints the decoded string and breaks the loop. If it doesn't, it decodes the string again and repeats the process. The decoding process is done by shifting each character in the string one place to the right. If the character is a space or a period, it is left unchanged. The character 'z' is replaced with 'a' to handle the wrap-around from 'z' to 'a'.
