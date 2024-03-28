```java
import java.util.*;

public class BlackAndWhiteTiles {

    static Map<Integer, Integer> memo = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        
        int result = calculateTiles(l, k);
        System.out.println(result);
    }

    public static int calculateTiles(int l, int k) {
        return sum(1, l, k, true);
    }

    public static int sum(int i, int l, int k, boolean isBlack) {
        if (i < 0) return 0;
        if (i == 0) return isBlack ? 0 : 1;
        
        int key = (i << 1) | (isBlack ? 1 : 0);
        if (memo.containsKey(key)) return memo.get(key);
        
        int res;
        if (isBlack) {
            res = sum(i - 1, l, k, false) + sum(i - k, l, k, false);
        } else {
            res = sum(i - 1, l, k, true);
        }
        
        memo.put(key, res);
        return res;
    }
}
```
