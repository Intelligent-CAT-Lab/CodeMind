```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());

            int t = n;
            for (int k = 1; k < Math.ceil(Math.log(n) / Math.log(2)); k++) {
                int d = (int) Math.ceil(Math.pow(n, 1.0 / k));
                int l = 0;
                int r = k;
                while (l + 1 < r) {
                    int c = (l + r) / 2;
                    if (n <= Math.pow(d - 1, k - c) * Math.pow(d, c)) {
                        r = c;
                    } else {
                        l = c;
                    }
                }
                t = Math.min(t, (d - 1) * (k - r) + d * r + (k - 1) * a);
            }
            System.out.println(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
