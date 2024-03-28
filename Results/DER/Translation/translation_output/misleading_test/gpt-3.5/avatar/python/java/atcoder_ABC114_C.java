```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int N = 333333357;
        System.out.println(aaa("0", N));
    }

    public static int aaa(String n, int N) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        int ans = (new HashSet<>(convertToIntArray(Integer.parseInt(n)))).equals(new HashSet<>(convertToIntArray(N))) ? 1 : 0;
        for (char i : "753".toCharArray()) {
            ans += aaa(n + i, N);
        }
        return ans;
    }

    public static Set<Integer> convertToIntArray(int num) {
        Set<Integer> set = new HashSet<>();
        while (num > 0) {
            set.add(num % 10);
            num /= 10;
        }
        return set;
    }
}
```
