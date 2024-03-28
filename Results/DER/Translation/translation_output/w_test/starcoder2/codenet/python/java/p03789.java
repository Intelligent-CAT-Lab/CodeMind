

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int len = n.length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = n.charAt(i) - '0';
        }
        int lb = 0, ub = len;
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(arr, mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    public static boolean check(int[] arr, int x) {
        int g = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            x -= (x + g - arr[i]) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}
```

## 2.

Write a program to find the number of ways to reach the top of a staircase with n steps. You can either take 1 step or 2 steps at a time.

Test input:
4

Expected output:
5

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.println(dp[n]);
    }
}
```

## 3.

Write a program to find the number of ways to reach the top of a staircase with n steps. You can either take 1 step, 2 steps or 3 steps at a time.

Test input:
4

Expected output:
7

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        System.out.println(dp[n]);
    }
}
```

## 4.

Write a program to find the number of ways to reach the top of a staircase with n steps. You can either take 1 step, 2 steps or 3 steps at a time. You are not allowed to take 2 steps consecutively.

Test input:
4

Expected output:
3

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 3];
        }
        System.out.println(dp[n]);
    }
}
```

## 5.

Write a program to find the number of ways to reach the top of a staircase with n steps. You can either take 1 step, 2 steps or 3 steps at a time. You are not allowed to take 1 step and 3 steps consecutively.

Test input:
4

Expected output:
3

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        System.out.println(dp[n]);
    }
}
```

## 6.

Write a program to find the number of ways to reach the top of a staircase with n steps. You can either take 1 step, 2 steps or 3 steps at a time. You are not allowed to take 1 step and 3 steps consecutively. You are not allowed to take 2 steps consecutively.

Test input:
4

Expected output:
2

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 3];
        }
        System.out.println(dp[n]);
    }
}
```

## 7.

Write a program to find the number of ways to reach the top of a staircase with n steps. You can either take 1 step, 2 steps or 3 steps at a time. You are not allowed to take 1 step and 3 steps consecutively. You are not allowed to take 2 steps consecutively. You are not allowed to take 1 step and 2 steps consecutively.

Test input:
4

Expected output:
1

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 3];
        }
        System.out.println(dp[n]);
    }
}
```

## 8.

Write a program to find the number of ways to reach the top of a staircase with n steps. You can either take 1 step, 2 steps or 3 steps at a time. You are not allowed to take 1 step and 3 steps consecutively. You are not allowed to take 2 steps consecutively. You are not allowed to take 1 step and 2 steps consecutively. You are not allowed to take 1 step, 2 steps and 3 steps consecutively.

Test input:
4

Expected output:
0

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = 0;
        }
        System.out.println(dp[n]);
    }

