Here is the translated code from Python to Java:

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int d = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int da = Integer.parseInt(st.nextToken());
        int db = Integer.parseInt(st.nextToken());
        solve(d, t, a, b, da, db);
    }

    private static void solve(int d, int t, int a, int b, int da, int db) {
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (a - da * i + b - db * j == d || a - da * i == d || b - db * j == d || d == 0) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
```

Please note that when translating Python code into Java, there is no direct counterpart for reading from `stdin` like Python's `input()`. Instead, I've used `BufferedReader` along with `InputStreamReader`. Also, instead of splitting at the time of reading, I've tokenized the input using `StringTokenizer` and parsed the integers later. The lambda expressions and the import from `collections` are not used in the translated Java code as Java has its own ways of handling such situations. Additionally, functions are defined as methods inside the `Main` class and are not standalone.
