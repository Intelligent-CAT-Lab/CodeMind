Below is the translation of your Python code into Java. Java does not have a built-in function equivalent to Python's `input()`. Normally, you'd use `Scanner` or `BufferedReader` to read input from the user in a Java program. Here's how the Python script could be translated to Java:

```java
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String patternString = "^A?KIHA?BA?RA?$";
        Pattern pattern = Pattern.compile(patternString);
        
        String s = scanner.nextLine();
        Matcher matcher = pattern.matcher(s);
        
        if (matcher.matches()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
```

Explanation:
- Import the necessary classes for regular expression (`Pattern` and `Matcher`) and `Scanner` for input.
- Compile the regex pattern using `Pattern.compile()`.
- Read a line of input from the user with `Scanner`.
- Match the input against the pattern using the `Matcher`'s `matches()` method.
- Based on whether a match is found, print "YES" or "NO".
