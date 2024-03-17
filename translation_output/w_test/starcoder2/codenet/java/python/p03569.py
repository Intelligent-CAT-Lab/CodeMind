

```python

```

## 3570. 最长公共子序列

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 2 1
3 2 1 4 7

Expected output:
3


```
import java.util.*;

public class p03570 {
    public void main(Scanner sc) {
        int[] a = new int[100000];
        int[] b = new int[100000];
        int[] dp = new int[100000];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    dp[j] = max + 1;
                } else {
                    dp[j] = Math.max(dp[j], dp[j + 1]);
                }
                max = Math.max(max, dp[j]);
            }
            ans = Math.max(ans, max);
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03570().main(sc);
        sc.close();
    }
}

```

python code:

```python

```

## 3571. 最长公共子串

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abcde
bcdef

Expected output:
3


```
import java.util.*;

public class p03571 {
    public void main(Scanner sc) {
        String s = sc.next();
        String t = sc.next();

        int n = s.length();
        int m = t.length();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < m; j++) {
                if (s.charAt(i + j) == t.charAt(j)) {
                    cnt++;
                } else {
                    cnt = 0;
                }
                ans = Math.max(ans, cnt);
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03571().main(sc);
        sc.close();
    }
}

```

python code:

```python

```

## 3572. 最长回文子串

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abcba

Expected output:
5


```
import java.util.*;

public class p03572 {
    public void main(Scanner sc) {
        String s = sc.next();
        int n = s.length();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                ans = Math.max(ans, r - l + 1);
                l--;
                r++;
            }

            l = i;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                ans = Math.max(ans, r - l + 1);
                l--;
                r++;
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03572().main(sc);
        sc.close();
    }
}

```

python code:

```python

```

## 3573. 最长回文子序列

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abcba

Expected output:
5


```
import java.util.*;

public class p03573 {
    public void main(Scanner sc) {
        String s = sc.next();
        int n = s.length();

        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(dp[0][n - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03573().main(sc);
        sc.close();
    }
}

```

python code:

```python

```

## 3574. 最长回文子序列

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abcba

Expected output:
5


```
import java.util.*;

public class p03574 {
    public void main(Scanner sc) {
        String s = sc.next();
        int n = s.length();

        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(dp[0][n - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03574().main(sc);
        sc.close();
    }
}

```

python code:

```python

```

## 3575. 最长回文子序列

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abcba

Expected output:
5


