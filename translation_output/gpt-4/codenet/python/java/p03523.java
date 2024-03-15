Below is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] splitPattern = S.split("(?!A)"); // Negative look-ahead to prevent consuming "A"s in split
            int[] L = new int[splitPattern.length];
            for (int i = 0; i < splitPattern.length; i++) {
                L[i] = splitPattern[i].length();
            }
            
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < L.length; i++) {
                if (L[i] > X[i]) {
                    b = false;
                    break;
                }
            }
        }

        System.out.println(b ? "YES" : "NO");
    }
}
```

I've replicated the functionality of the original Python code, and I have taken some liberties where the syntax and language features don't map one-to-one between Python and Java. For instance, I used a look-ahead in the `split()` method to handle splitting on every character except 'A', and then used a loop to count lengths to mimic the behavior of the Python `map(len, ...)` function. The `print("YNEOS"[not b::2])` is a clever trick in Python to print "YES" or "NO" depending on the boolean value `b`, which I've converted to a simple ternary operator that returns the corresponding strings.
