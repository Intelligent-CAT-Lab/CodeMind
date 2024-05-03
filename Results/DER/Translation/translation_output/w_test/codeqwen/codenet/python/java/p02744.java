Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> ans = main(n);
        for (String i : ans) {
            System.out.println(i);
        }
    }

    public static List<String> main(int n) {
        if (n == 1) {
            return Arrays.asList("a");
        } else {
            List<String> ans = new ArrayList<>();
            for (String k : main(n - 1)) {
                ans.addAll(f(k));
            }
            return ans;
        }
    }

    public static List<String> f(String s) {
        int m = (int) s.chars().max().getAsInt() - 96;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < m + 2; i++) {
            res.add(s + (char) (i + 97));
        }
        return res;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, calls the `main` method with this integer, and then prints all the strings in the returned list. The `main` method is a recursive function that calls itself with `n-1` until `n` is 1, at which point it returns a list containing only the string "a". The `f` method takes a string `s` and returns a list of strings where each string is `s` followed by a character from 'a' to 'z'.
