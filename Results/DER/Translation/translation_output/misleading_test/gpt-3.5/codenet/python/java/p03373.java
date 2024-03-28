```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int x = Integer.parseInt(input[3]);
        int y = Integer.parseInt(input[4]);

        int ans = 0;
        if (2 * c <= a + b) {
            ans += Math.min(x, y) * 2 * c;
            int q = Math.min(x, y);
            x -= q;
            y -= q;

            if (x > 0 && 2 * c <= a) {
                ans += 2 * c * x;
            } else if (x > 0) {
                ans += a * x;
            } else if (y > 0 && 2 * c <= b) {
                ans += 2 * c * y;
            } else {
                ans += b * y;
            }
        } else {
            ans = x * a + y * b;
        }

        System.out.println(ans);
    }
}
```
```
