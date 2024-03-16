Below is the translated Java code for the given Python program:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        if (s.length() < 26) {
            for (int i = 0; i < 26; ++i) {
                char tmp = (char)(i + 'a');
                if (!s.contains(String.valueOf(tmp))) {
                    System.out.println(s + tmp);
                    System.exit(0);
                }
            }
        } else {
            for (int i = 25; i >= 0; --i) {
                for (int j = s.charAt(i) + 1; j <= 'z'; ++j) {
                    if (!s.substring(0, i).contains(String.valueOf((char)j))) {
                        System.out.println(s.substring(0, i) + (char)j);
                        System.exit(0);
                    }
                }
            }
            System.out.println(-1);
            System.exit(0);
        }
    }
}
```

Please note that there are some key differences between Python and Java which are handled in the code above:

1. Java uses `BufferedReader` and `InputStreamReader` to read input from `stdin`.
2. There's no direct equivalent of Python's `exit()` in Java for early termination, so I used `System.exit(0)`.
3. Java's `String` class has a `contains` method that replaces the `'in'` operator for strings from Python.
4. String concatenation and character manipulations are performed in a similar manner using the `+` operator and character arithmetic.

You can run this Java program, and it should exhibit the same behavior as the given Python code when provided with the input "atcoder".
