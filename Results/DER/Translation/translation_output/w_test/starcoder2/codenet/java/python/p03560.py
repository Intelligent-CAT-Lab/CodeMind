
```python
import heapq

K = int(input())
dp = [float('inf')]*K

for i in range(1, min(10, K)):
    dp[i] = i
    heapq.heappush(que, (i, i))

while que:
    c, v = heapq.heappop(que)
    if c > dp[v]:
        continue
    for i in range(10):
        nextv = (v*10+i)%K
        nextc = c+i
        if dp[nextv] > nextc:
            dp[nextv] = nextc
            heapq.heappush(que, (nextc, nextv))

print(dp[0])
```

## 03561

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

class p03561{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] dp = new int[N+1];
        dp[0]=1;
        for(int i=1;i<=N;++i){
            for(int j=1;j<=6;++j){
                if(i-j>=0)dp[i]+=dp[i-j];
            }
        }
        System.out.println(dp[N]);
    }
}
```

python code:
```python
N = int(input())
dp = [0]*(N+1)
dp[0] = 1
for i in range(1, N+1):
    for j in range(1, 7):
        if i-j >= 0:
            dp[i] += dp[i-j]
print(dp[N])
```

## 03562

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

class p03562{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] dp = new int[N+1];
        dp[0]=1;
        for(int i=1;i<=N;++i){
            for(int j=1;j<=6;++j){
                if(i-j>=0)dp[i]+=dp[i-j];
            }
        }
        System.out.println(dp[N]);
    }
}
```

python code:
```python
N = int(input())
dp = [0]*(N+1)
dp[0] = 1
for i in range(1, N+1):
    for j in range(1, 7):
        if i-j >= 0:
            dp[i] += dp[i-j]
print(dp[N])
```

## 03563

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

class p03563{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] dp = new int[N+1];
        dp[0]=1;
        for(int i=1;i<=N;++i){
            for(int j=1;j<=6;++j){
                if(i-j>=0)dp[i]+=dp[i-j];
            }
        }
        System.out.println(dp[N]);
    }
}
```

python code:
```python
N = int(input())
dp = [0]*(N+1)
dp[0] = 1
for i in range(1, N+1):
    for j in range(1, 7):
        if i-j >= 0:
            dp[i] += dp[i-j]
print(dp[N])
```

## 03564

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

class p03564{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] dp = new int[N+1];
        dp[0]=1;
        for(int i=1;i<=N;++i){
            for(int j=1;j<=6;++j){
                if(i-j>=0)dp[i]+=dp[i-j];
            }
        }
        System.out.println(dp[N]);
    }
}
```

python code:
```python
N = int(input())
dp = [0]*(N+1)
dp[0] = 1
for i in range(1, N+1):
    for j in range(1, 7):
        if i-j >= 0:
            dp[i] += dp[i-j]
print(dp[N])
```

## 03565

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

class p03565{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] dp = new int[N+1];
        dp[0]=1;
        for(int i=1;i<=N;++i){
            for(int j=1;j<=6;++j){
                if(i-j>=0)dp[i]+=dp[i-j];
            }
        }
        System.out.println(dp[N]);
    }
}
```

python code:
```python
N = int(input())
dp = [0]*(N+1)
dp[0] = 1
for i in range(1, N+1):
    for j in range(1, 7):
        if i-j >= 0:
            dp[i] += dp[i-j]
print(dp[N])
```

## 03566

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```
import java.util.Scanner;

class p03566{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] dp
