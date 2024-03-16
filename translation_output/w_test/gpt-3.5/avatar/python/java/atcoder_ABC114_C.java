```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(aaa("0", N));
    }

    public static int aaa(String n, int N) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        int ans = (new HashSet<>(Arrays.asList('7', '5', '3')).equals(new HashSet<>(Arrays.asList(n.toCharArray()))) ? 1 : 0);
        for (char c : "753".toCharArray()) {
            ans += aaa(n + c, N);
        }
        return ans;
    }
}
```
