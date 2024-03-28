

```python
s = input()
if s == "ABC":
    print("ARC")
else:
    print("ABC")
```

## 02688

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class p02688 {
    public static final int MOD = 1000000007;
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        sc.close();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(i=1;i<=n;i++) {
            for(j=1;j<=6;j++) {
                if(i-j>=0) {
                    dp[i] += dp[i-j];
                    dp[i] %= MOD;
                }
            }
        }
        out.println(dp[n]);
    }
}

```

python code:

```python
n = int(input())
dp = [0] * (n+1)
dp[0] = 1
for i in range(1, n+1):
    for j in range(1, 7):
        if i-j >= 0:
            dp[i] += dp[i-j]
            dp[i] %= 1000000007
print(dp[n])
```

## 02689

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class p02689 {
    public static final int MOD = 1000000007;
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        sc.close();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(i=1;i<=n;i++) {
            for(j=1;j<=6;j++) {
                if(i-j>=0) {
                    dp[i] += dp[i-j];
                    dp[i] %= MOD;
                }
            }
        }
        out.println(dp[n]);
    }
}

```

python code:

```python
n = int(input())
dp = [0] * (n+1)
dp[0] = 1
for i in range(1, n+1):
    for j in range(1, 7):
        if i-j >= 0:
            dp[i] += dp[i-j]
            dp[i] %= 1000000007
print(dp[n])
```

## 02690

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class p02690 {
    public static final int MOD = 1000000007;
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        sc.close();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(i=1;i<=n;i++) {
            for(j=1;j<=6;j++) {
                if(i-j>=0) {
                    dp[i] += dp[i-j];
                    dp[i] %= MOD;
                }
            }
        }
        out.println(dp[n]);
    }
}

```

python code:

```python
n = int(input())
dp = [0] * (n+1)
dp[0] = 1
for i in range(1, n+1):
    for j in range(1, 7):
        if i-j >= 0:
            dp[i] += dp[i-j]
            dp[i] %= 1000000007
print(dp[n])
```

## 02691

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class p02691 {
    public static final int MOD = 1000000007;
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        sc.close();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(i=1;i<=n;i++) {
            for(j=1;j<=6;j++) {
                if(i-j>=0) {
                    dp[i] += dp[i-j];
                    dp[i] %= MOD;
                }
            }
        }
        out.println(dp[n]);
    }
}

```

python code:

```python
n = int(input())
dp = [0] * (n+1)
dp[0] = 1
for i in range(1, n+1):
    for j in range(1, 7):
        if i-j >= 0:
            dp[i] += dp[i-j]
            dp[i] %= 1000000007
print(dp[n])
```

## 02692

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100

Expected output:
100

```
import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class p02692 {
    public static final int MOD = 1000000007;
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        sc.close();
        int[] dp = new int[n+1];
        dp[
