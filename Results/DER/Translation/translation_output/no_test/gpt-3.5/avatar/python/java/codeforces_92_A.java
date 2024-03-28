```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        int i = 0;
        int ans = 0;
        while (true) {
            if (i + 1 > m) {
                ans = m;
                break;
            }
            m -= i + 1;
            i += 1;
            i %= n;
        }
        System.out.println(ans);
    }
}
```
