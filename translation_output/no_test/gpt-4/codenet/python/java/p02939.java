Here is the Python code translated to Java, enclosed within ```java```:

```java
import java.util.Scanner;

public class SequenceLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        int[] l = new int[S.length() + 1];
        l[1] = 1;
        if (S.charAt(0) == S.charAt(1)) {
            l[2] = 1;
        } else {
            l[2] = 2;
        }

        for (int i = 3; i <= S.length(); i++) {
            if (S.charAt(i - 1) != S.charAt(i - 2)) {
                l[i] = l[i - 1] + 1;
            } else {
                l[i] = l[i - 3] + 2;
            }
        }

        System.out.println(l[S.length()]);
    }
}
```

Please note that Java arrays are indexed from 0, and in Java you would typically use a `Scanner` object to read input from the console. Additionally, the syntax for accessing characters in a string is with `charAt(index)` method rather than array indexing as in Python. Lastly, since Java is a statically typed language, we need to specify the types for all variables and the return values for functions.
