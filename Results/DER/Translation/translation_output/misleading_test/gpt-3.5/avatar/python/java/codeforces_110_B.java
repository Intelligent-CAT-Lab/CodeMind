```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int MOD = 1000000007;

    static void solution() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine().trim());
            System.out.print(" abcd".repeat(n / 4) + " abc".substring(0, n % 4));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int t = 1;
        for (int i = 0; i < t; i++) {
            solution();
        }
    }
}
```

