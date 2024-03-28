

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] p = new int[6];
        int cur = 0;
        int l = s.length();
        while (cur < l) {
            char op = '+';
            while (true) {
                term(op, p);
                if (cur == l) {
                    break;
                }
                op = s.charAt(cur);
                cur++;
            }
        }
        int d = 5;
        while (p[d] == 0) {
            d--;
        }
        List<Integer> r = new ArrayList<>();
        for (int x = 2000; x >= -2001; x--) {
            if (f(p, x) == 0) {
                r.add(x);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int x : r) {
            sb.append("(x").append(x).append(")");
        }
        System.out.println(sb.toString());
    }

    public static void term(char op, int[] p) {
        int cur = 0;
        int k = 1;
        if (cur < p.length && p[cur] != 'x') {
            k = num();
        }
        int d = 0;
        if (cur < p.length && p[cur] == 'x') {
            cur++;
            d = 1;
            if (cur < p.length && p[cur] == '^') {
                cur++;
                d = num();
            }
        }
        p[d] = k;
    }

    public static int num() {
        int cur = 0;
        int v = 0;
        while (cur < p.length && p[cur] >= '0' && p[cur] <= '9') {
            v = 10 * v + (p[cur] - '0');
            cur++;
        }
        return v;
    }

    public static int f(int[] p, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += p[i] * (int) Math.pow(x, i);
        }
        return res;
    }
}
```

## 2.

Write a program to find the number of ways to write a given number as a sum of 1, 3, 4.

For example, if n = 6, there are 6 ways:

1+1+1+1+1+1

1+1+1+3

1+1+3+1

1+3+1+1

3+1+1+1

3+3

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i - 1 >= 0) {
                dp[i] += dp[i - 1];
            }
            if (i - 3 >= 0) {
                dp[i] += dp[i - 3];
            }
            if (i - 4 >= 0) {
                dp[i] += dp[i - 4];
            }
        }
        System.out.println(dp[n]);
    }
}
```

## 3.

Write a program to find the number of ways to write a given number as a sum of 1, 3, 4.

For example, if n = 6, there are 6 ways:

1+1+1+1+1+1

1+1+1+3

1+1+3+1

1+3+1+1

3+1+1+1

3+3

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i - 1 >= 0) {
                dp[i] += dp[i - 1];
            }
            if (i - 3 >= 0) {
                dp[i] += dp[i - 3];
            }
            if (i - 4 >= 0) {
                dp[i] += dp[i - 4];
            }
        }
        System.out.println(dp[n]);
    }
}
```

## 4.

Write a program to find the number of ways to write a given number as a sum of 1, 3, 4.

For example, if n = 6, there are 6 ways:

1+1+1+1+1+1

1+1+1+3

1+1+3+1

1+3+1+1

3+1+1+1

3+3

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i - 1 >= 0) {
                dp[i] += dp[i - 1];
            }
            if (i - 3 >= 0) {
                dp[i] += dp[i - 3];
            }
            if (i - 4 >= 0) {
                dp[i] += dp[i - 4];
            }
        }
        System.out.println(dp[n]);
    }
}
```

## 5.

Write a program to find the number of ways to write a given number as a sum of 1, 3, 4.

For example, if n = 6, there are 6 ways:

1+1+1+1+1+1

1+1+1+3

1+1+3+1

1+3+1+1

3+1+1+1

3+3

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i - 1 >= 0) {
                dp[i] += dp[i - 1];
            }
            if (i - 3 >= 
