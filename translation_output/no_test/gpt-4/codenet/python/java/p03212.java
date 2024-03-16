```java
import java.util.Scanner;

public class Main {
    
    private static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println(dfs("0"));
        scanner.close();
    }

    private static int dfs(String s) {
        int num = Integer.parseInt(s);
        if (num > n) {
            return 0;
        }
        int ret = (s.contains("7") && s.contains("5") && s.contains("3")) ? 1 : 0;
        for (char c : new char[]{'7', '5', '3'}) {
            ret += dfs(s + c);
        }
        return ret;
    }
}
```
