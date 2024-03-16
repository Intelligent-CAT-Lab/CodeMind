Here is the translated Java code that replicates the functionality of the given Python code:

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
        int ret = containsAll753(s) ? 1 : 0;
        for (char c : new char[]{'7', '5', '3'}) {
            ret += dfs(s + c);
        }
        return ret;
    }

    private static boolean containsAll753(String s) {
        return s.contains("7") && s.contains("5") && s.contains("3");
    }
}
```

This code defines a `Main` class with a `main` method to accept input, and it contains methods `dfs` and `containsAll753` to perform depth-first search and check the presence of '7', '5', and '3', respectively. Please note that you must compile and execute in an Java environment for this code to work.
