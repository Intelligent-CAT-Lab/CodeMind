Here is the translated Java code based on the provided Python code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(reader.readLine().trim());
        solve(s);
    }

    private static void solve(long s) {
        int m = 1;
        long pre = s;
        Set<Long> st = new HashSet<>();
        st.add(s);

        while (true) {
            m += 1;
            long tmp;
            if (pre % 2 == 0) {
                tmp = pre / 2;
            } else {
                tmp = 3 * pre + 1;
            }

            if (st.contains(tmp)) {
                System.out.println(m);
                return;
            }

            pre = tmp;
            st.add(tmp);
        }
    }
}
```

Please note the following:
- Java uses `BufferedReader` and `InputStreamReader` for input, replacing the `sys.stdin.readline()` function from Python.
- Type casting is explicit in Java, and variables must be declared with a type.
- In Java, the input reading and data conversion are done separately.
- The `HashSet` class from the `java.util` package is used to replace the `set` data structure from Python.
- Java methods and fields inside a public class need explicit access modifiers (like `public`, `private`), while Python does not require this.
- In the `solve` method, the loop continues indefinitely until it finds the repeating number, just like in the Python code.
- The division `/` operator in Java on two integers results in an integer, but since we're dealing with a `long` type, explicit type casting is not necessary.
- The curly braces `{}` are used to define blocks of code in Java (such as method bodies, loop bodies, etc.), whereas Python uses indentation to define blocks.

Please make sure that you adjust the class name (`Main`) and package declarations if necessary, as per the requirements of the environment in which you will compile and run the Java code.
