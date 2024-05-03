Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(dfs("0", n));
    }

    public static int dfs(String s, int n) {
        if (Integer.parseInt(s) > n) {
            return 0;
        }
        int ret = 1;
        for (char c : "753".toCharArray()) {
            if (s.indexOf(c) >= 0) {
                ret += dfs(s + c, n);
            }
        }
        return ret;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then calls the `dfs` function with the initial string "0" and the user's input. The `dfs` function works similarly to your Python code. It checks if the current string is greater than the user's input, and if so, it returns 0. Otherwise, it checks if the current string contains all the characters '7', '5', and '3'. If it does, it increments the `ret` variable. Then, it loops through each character in the string '753', and if the current string contains that character, it calls itself with the current string plus that character. The result of each recursive call is added to `ret`. Finally, the `dfs` function returns `ret`. The `main` function reads the user's input, calls the `dfs` function with the initial string "0" and the user's input, and prints the result.
