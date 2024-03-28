```java
import java.util.Scanner;

public class Main {
    private static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(dfs("0"));
    }

    private static int dfs(String s) {
        if (Integer.parseInt(s) > n) {
            return 0;
        }
        int ret = isGood(s) ? 1 : 0;
        for (char c : "753".toCharArray()) {
            ret += dfs(s + c);
        }
        return ret;
    }

    private static boolean isGood(String s) {
        for (char c : "753".toCharArray()) {
            if (s.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
```
