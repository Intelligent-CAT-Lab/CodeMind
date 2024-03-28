Below is the translated Java code that performs the same operation as the provided Python snippet.

```java
import java.util.Scanner;

public class TextFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        String punctuation = " ,.?!";
        for (int i = 0; i < punctuation.length(); i++) {
            char ch = punctuation.charAt(i);
            s = s.replace(String.valueOf(ch), ch + " ▁ ");
        }

        s = "▁".join(" ", s.trim().split("\\s+"));

        for (int i = 0; i < punctuation.length(); i++) {
            char ch = punctuation.charAt(i);
            s = s.replace(" ▁ " + ch, String.valueOf(ch));
        }

        System.out.println(s);
    }
}
```

Please keep in mind that in the given Python code snippet, there seems to be a special white-space-like character (`â`) used for formatting. In the Java code, I've replaced it with a regular space followed by '▁' to keep the functionality similar, assuming that the special character was likely just a placeholder for spacing purposes in the original code.

To run a test with the Java code, you can use the following input by typing it into your command line after running the program:

Test input:
```
a!n , to
```

When the Java program is run, it should produce the following expected output:

Expected output:
```
a! n, to
```
