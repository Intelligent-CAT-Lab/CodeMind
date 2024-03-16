```java
import java.util.*;

public class Main {

    static Map<String, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, true, k);
        }

        System.out.println(ans);
    }

    static int rec(int i, boolean isBlack, int k) {
        String key = i + "," + isBlack;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }

        int result;
        if (i < 0) {
            result = 0;
        } else if (i == 0) {
            result = isBlack ? 0 : 1;
        } else if (isBlack) {
            result = rec(i - 1, false, k) + rec(i - k, false, k);
        } else {
            result = rec(i - 1, true, k);
        }

        cache.put(key, result);
        return result;
    }
}
```
