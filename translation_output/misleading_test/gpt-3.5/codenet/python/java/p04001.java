```java
import java.util.*;

public class Dfs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(dfs(0, new ArrayList<>(Arrays.asList(0)), s, 0));
    }

    public static int dfs(int i, List<Integer> sep, String s, int tot) {
        int n = s.length();
        i += 1;

        // Base case: reached the deepest depth
        if (i == n) {
            int ans = 0;
            if (sep.size() > 1) {
                for (int j = 0; j < sep.size() - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep.get(j), sep.get(j + 1)));
                }
            }
            ans += Integer.parseInt(s.substring(sep.get(sep.size() - 1)));
            return ans;
        }

        // Case where '+' is inserted at current position
        sep.add(i);
        tot += dfs(i, sep, s, 0);

        // Case where '+' is not inserted at current position
        sep.remove(sep.size() - 1);
        tot += dfs(i, sep, s, 0);

        return tot;
    }
}
```
