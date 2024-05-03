Here is the Java version of the provided Python code:

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

This Java code does the same thing as the Python code. It reads an integer from the user, then calls the `dfs` function with the initial string "0" and the user's input. The `dfs` function works similarly to the Python code, but it uses Java's `indexOf` method to check if a digit is present in the string. The `indexOf` method returns -1 if the digit is not present, so we use this to determine if all digits from 5 to 7 are present in the string.
