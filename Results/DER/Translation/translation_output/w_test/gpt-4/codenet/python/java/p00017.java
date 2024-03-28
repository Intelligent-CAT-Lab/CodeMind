Below is the translated Java code from the given Python script. Note that the Java code is structured differently as Java requires a class and main method definition.

```java
import java.util.Scanner;

public class CaesarCipherDecoder {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Read input until there is no more input
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

    private static String decode(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != ' ' && c != '.') {
                // Shift character by 1, wrapping around after 'z'
                if (c == 'z') {
                    result.append((char) ('a'));
                } else {
                    result.append((char) (c + 1));
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
```

In the Java program, I created a `CaesarCipherDecoder` class and implemented the main method to read from `System.in` using `Scanner`. The `decode` function is similar to the Python version but takes advantage of Java's `StringBuilder` for efficiency. 

Instead of directly operating with the `stdin` stream as the Python script does, the Java program reads continuously from the console input until there is no more input, matching the behavior of `sys.stdin.readlines()`. However, if you want to read multiple test cases at once, you would need to use end-of-file (EOF) in the console to stop the scanner from waiting for further input. Alternatively, you can adjust the code to read a specific number of lines if you know the test case count beforehand.
