Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            if (i % 2 != 0) {
                ans.add(new int[]{i, 0});
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (i % 6 == 1) {
                for (int j = 2; j < n; j++) {
                    if (j % 2 == 0) {
                        ans.add(new int[]{i, j});
                    }
                }
            }
            if (i % 6 == 4) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 != 0) {
                        ans.add(new int[]{i, j});
                    }
                }
            }
        }

        for (int j = 0; j < n; j++) {
            if ((n - 1 + j) % 2 != 0) {
                ans.add(new int[]{n - 1, j});
            }
        }

        System.out.println(ans.size());
        for (int[] pair : ans) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
```

Please note that in Java, we use `System.console().readLine()` to get user input, and `ArrayList` is used to store the pairs of integers. The `new int[]{i, j}` syntax is used to create a new array with two elements, `i` and `j`.
