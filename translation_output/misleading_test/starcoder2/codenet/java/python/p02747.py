

```python
S = input()

ans = "Yes"

if len(S) % 2 == 1:
    ans = "No"
else:
    for i in range(0, len(S), 2):
        if S[i:i+2] != "hi":
            ans = "No"

print(ans)
```

## 2748

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
55

```
import java.util.*;

public class p02748 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] dp = new int[N+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=N;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[N]);

    }

}








```

python code:

```python
N = int(input())

dp = [0] * (N+1)

dp[0] = 0
dp[1] = 1

for i in range(2, N+1):
    dp[i] = dp[i-1] + dp[i-2]

print(dp[N])
```

## 2749

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000

Expected output:
1234567890

```
import java.util.*;

public class p02749 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long[] dp = new long[N+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=N;i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000000;
        }

        System.out.println(dp[N]);

    }

}








```

python code:

```python
N = int(input())

dp = [0] * (N+1)

dp[0] = 0
dp[1] = 1

for i in range(2, N+1):
    dp[i] = (dp[i-1] + dp[i-2]) % 1000000000

print(dp[N])
```


```

python code:

```python
N = int(input())

dp = [0] * (N+1)

dp[0] = 0
dp[1] = 1

for i in range(2, N+1):
    dp[i] = dp[i-1] + dp[i-2]

print(dp[N])
```

## 2749

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000

Expected output:
1234567890

```
import java.util.*;

public class p02749 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long[] dp = new long[N+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=N;i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000000;
        }

        System.out.println(dp[N]);

    }

}








```

python code:

```python
N = int(input())

dp = [0] * (N+1)

dp[0] = 0
dp[1] = 1

for i in range(2, N+1):
    dp[i] = (dp[i-1] + dp[i-2]) % 1000000000

print(dp[N])
```
/README.md
# Java to Python

## 2747

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
55

```
import java.util.*;

public class p02747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] dp = new int[N+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=N;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[N]);

    }

}








```

python code:

```python
N = int(input())

dp = [0] * (N+1)

dp[0] = 0
dp[1] = 1

for i in range(2, N+1):
    dp[i] = dp[i-1] + dp[i-2]

print(dp[N])
```

## 2748

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
55

```
import java.util.*;

public class p02748 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] dp = new int[N+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=N;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[N]);

    }

}








```

python code:

```python
N = int(input())

dp = [0] * (N+1)

dp[0] = 0
dp[1] = 1

for i in range(2, N+1):
    dp[i] = dp[i-1] + dp[i-2]

print(dp[N])
```

## 2749

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000

Expected output:
1234567890

```
import java.util.*;

public class p02749 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long[] dp = new long[N+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=N;i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000000;
