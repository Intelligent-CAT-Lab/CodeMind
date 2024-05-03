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
        boolean allDigitsPresent = true;
        for (char c : "753".toCharArray()) {
            if (s.indexOf(c) == -1) {
                allDigitsPresent = false;
                break;
            }
        }
        int ret = allDigitsPresent ? 1 : 0;
        for (char c : "753".toCharArray()) {
            ret += dfs(s + c, n);
        }
        return ret;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then calls the `dfs` function with the string "0" and the user's input. The `dfs` function works similarly to your Python code. It checks if the current string is greater than the user's input, and if so, it returns 0. Otherwise, it checks if all the digits 7, 5, and 3 are present in the string. If they are, it increments the return value by 1. Then, it loops through the digits 7, 5, and 3, and for each one, it recursively calls the `dfs` function with the current string plus the digit. The return value of each recursive call is added to the return value of the current function. Finally, the `main` function prints the return value of the `dfs` function.
