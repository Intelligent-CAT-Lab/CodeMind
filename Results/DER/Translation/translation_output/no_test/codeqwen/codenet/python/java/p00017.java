Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().trim();
            for (int i = 0; i < 26; i++) {
                if (s.contains("the") || s.contains("that") || s.contains("this")) {
                    System.out.println(s);
                    break;
                }
                s = decode(s);
            }
        }
        scanner.close();
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

This Java code does the same thing as your Python code. It reads lines from the standard input, decodes each line, and checks if the decoded line contains the words "the", "that", or "this". If it does, it prints the line and breaks out of the loop. If it doesn't, it decodes the line again and repeats the process. The decoding process is the same as in your Python code: it shifts each character in the string by 1, except for spaces and periods, which are left unchanged.
