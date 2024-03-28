Below you will find the translated Java code based on the provided Python code. The translation assumes you are taking input from stdin until an EOF (End-of-File) occurs, which can be simulated by pressing `Ctrl+D` (on Unix-like systems) or `Ctrl+Z` followed by `Enter` (on Windows) when the program is awaiting input.

```java
import java.util.Scanner;

public class CaesarCipherDecoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().strip();
            for (int i = 0; i < 26; i++) { // 'z' - 'a' + 1 = 26
                if (s.contains("the") || s.contains("that") || s.contains("this")) {
                    System.out.println(s);
                    break;
                }
                s = decode(s);
            }
        }

        scanner.close();
    }

    private static String decode(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!(c == ' ' || c == '.')) {
                char shiftedChar = (char)(c + 1);
                if (shiftedChar > 'z') {
                    shiftedChar = 'a';
                }
                result.append(shiftedChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
```

The Java code uses a `Scanner` to read lines from `stdin`, and a `StringBuilder` to efficiently build strings. It maintains the logic from the Python code: modifying letters by shifting them by one unless they are spaces or periods, and replacing 'z' + 1 (or a character beyond 'z') with 'a'. It then prints the first decoded string containing "the", "that", or "this".
