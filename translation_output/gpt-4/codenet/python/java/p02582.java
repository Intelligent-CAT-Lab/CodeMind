Below is the translated Java code for the provided Python code snippet:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        try {
            solve();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void solve() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();

        if ("RRR".equals(s)) {
            System.out.println(3);
        } else if ("RRS".equals(s) || "SRR".equals(s)) {
            System.out.println(2);
        } else if (!s.contains("R")) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }

}
```

Make sure to run this Java program with the necessary setup to read from `stdin` if you're expecting to provide input interactively or redirecting input from a file.
