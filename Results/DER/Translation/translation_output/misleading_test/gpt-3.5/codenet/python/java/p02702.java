```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] remain = new int[2020];
        Arrays.fill(remain, 0);
        int now = 0;
        int ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            now += Integer.parseInt(s.substring(i, i + 1)) * Math.pow(10, s.length() - i - 1) % 2019;
            ans += remain[now % 2019];
            remain[now % 2019]++;
        }

        ans += remain[0];

        System.out.println(ans);
    }
}
```
