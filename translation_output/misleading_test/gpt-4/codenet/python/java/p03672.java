Below is the equivalent Java code for the provided Python script:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        // create the lll list equivalent as in Python code
        int[] lll = IntStream.rangeClosed(2, s.length() - 2)
                .filter(i -> i % 2 == 1)
                .map(i -> s.length() - i)
                .toArray();

        for (int i : lll) {
            eprint("range: ", lll);
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                eprint("debug : ", "false this time");
            }
        }
    }

    private static void eprint(String... messages) {
        PrintStream errorStream = System.err;
        for (String message : messages) {
            errorStream.print(message);
        }
    }
}
```

Please note that Java handles strings and printing to the standard error stream differently from Python. The `println` method is used for normal output (`System.out.println`) and for the error output (`System.err.println`). Additionally, stream ranges are used in Java as a replacement for the reversed list comprehensions in Python, and string comparisons are done using the `equals` method instead of `==`.
