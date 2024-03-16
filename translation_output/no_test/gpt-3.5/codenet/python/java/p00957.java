```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<String, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;
        for (int i = 1; i <= l; i++) {
            ans += rec(i, true);
        }

        System.out.println(ans);
    }

    static int rec(int i, boolean isBlack) {
        if (i < 0) return 0;
        if (i == 0) return !isBlack ? 1 : 0; // black at bottom
        if (isBlack) { // top is black
            return rec(i - 1, false) + rec(i - k, false);
        } else { // top is white
            return rec(i - 1, true);
        }
    }

    static int rec(int i, boolean isBlack) {
        String key = i + " " + isBlack;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        int result;
        if (i < 0) {
            result = 0;
        } else if (i == 0) {
            result = !isBlack ? 1 : 0;
        } else if (isBlack) {
            result = rec(i - 1, false) + rec(i - k, false);
        } else {
            result = rec(i - 1, true);
        }
        cache.put(key, result);
        return result;
    }
}
```
