```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        String[][] ans = new String[(1 << n) - 1][(1 << m) - 1];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                ans[i][j] = "1";
            }
        }

        for (int k = 1; k < 11; k++) {
            for (int i = (1 << k); i < (1 << n); i += (1 << k)) {
                for (int j = (1 << k); j < (1 << m); j += (1 << k)) {
                    if (ans[i - 1][j - 1].equals("1")) {
                        ans[i - 1][j - 1] = "0";
                    } else {
                        ans[i - 1][j - 1] = "1";
                    }
                }
            }
        }

        for (int i = 0; i < ans.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < ans[i].length; j++) {
                sb.append(ans[i][j]);
            }
            System.out.println(sb.toString());
        }
    }
}
```
```
