Here is the Java version of your Python code:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String s = "125";
        System.out.println(dfs(0, new ArrayList<Integer>(), s, 0));
    }

    public static int dfs(int i, ArrayList<Integer> sep, String s, int tot) {
        int n = s.length();
        i += 1;

        // ææ·±é¨ã¾ã§å°éããæ
        if (i == n) {
            int ans = 0;
            if (sep.size() > 1) {
                for (int j = 0; j < sep.size() - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep.get(j), sep.get(j + 1)));
                }
            }
            ans += Integer.parseInt(s.substring(sep.get(sep.size() - 1), s.length()));
            return ans;
        }

        // içªç®ã«+ãå¥ããæ
        sep.add(i);
        tot += dfs(i, sep, s, 0);

        // içªç®ã«+ãå¥ããªãæ
        sep.remove(sep.size() - 1);
        tot += dfs(i, sep, s, 0);

        return tot;
    }
}
```

This Java code does the same thing as your Python code. It takes a string as input, and recursively calculates the sum of all the numbers in the string. The `dfs` function is a recursive function that takes the current index `i`, a list of separators `sep`, the string `s`, and the current total `tot`. If the current index is equal to the length of the string, it calculates the sum of all the numbers in the string and returns it. Otherwise, it recursively
