
```python
import heapq

K = int(input())
dp = [float('inf')]*K

for i in range(1,min(10,K)):
    dp[i] = i
    heapq.heappush(que,(i,i))

while que:
    c,v = heapq.heappop(que)
    if c > dp[v]:
        continue
    for i in range(10):
        nextv = (v*10+i)%K
        nextc = c+i
        if dp[nextv] > nextc:
            dp[nextv] = nextc
            heapq.heappush(que,(nextc,nextv))

print(dp[0])
```

## 03561

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

class p03561{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] dp = new int[N+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=N;++i){
            for(int j=1;j*j<=i;++j){
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        System.out.println(dp[N]);
    }
}
```

python code:
```python
N = int(input())
dp = [float('inf')]*(N+1)
dp[0] = 0

for i in range(1,N+1):
    for j in range(1,int(i**0.5)+1):
        dp[i] = min(dp[i],dp[i-j*j]+1)

print(dp[N])
```

## 03562

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

class p03562{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] dp = new int[N+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=N;++i){
            for(int j=1;j<=i;++j){
                dp[i]=Math.min(dp[i],dp[i-j]+1);
            }
        }
        System.out.println(dp[N]);
    }
}
```

python code:
```python
N = int(input())
dp = [float('inf')]*(N+1)
dp[0] = 0

for i in range(1,N+1):
    for j in range(1,i+1):
        dp[i] = min(dp[i],dp[i-j]+1)

print(dp[N])
```

## 03563

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

class p03563{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] dp = new int[N+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=N;++i){
            for(int j=1;j<=i;++j){
                dp[i]=Math.min(dp[i],dp[i-j]+1);
            }
            for(int j=1;j*j<=i;++j){
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        System.out.println(dp[N]);
    }
}
```

python code:
```python
N = int(input())
dp = [float('inf')]*(N+1)
dp[0] = 0

for i in range(1,N+1):
    for j in range(1,i+1):
        dp[i] = min(dp[i],dp[i-j]+1)
    for j in range(1,int(i**0.5)+1):
        dp[i] = min(dp[i],dp[i-j*j]+1)

print(dp[N])
```

## 03564

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

class p03564{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] dp = new int[N+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=N;++i){
            for(int j=1;j<=i;++j){
                dp[i]=Math.min(dp[i],dp[i-j]+1);
            }
            for(int j=1;j*j<=i;++j){
                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
            }
            for(int j=1;j*j*j<=i;++j){
                dp[i]=Math.min(dp[i],dp[i-j*j*j]+1);
            }
        }
        System.out.println(dp[N]);
    }
}
```

python code:
```python
N = int(input())
dp = [float('inf')]*(N+1)
dp[0] = 0

for i in range(1,N+1):
    for j in range(1,i+1):
        dp[i] = min(dp[i],dp[i-j]+1)
    for j in range(1,int(i**0.5)+1):
        dp[i] = min(dp[i],dp[i-j*j]+1)
    for j in range(1,int(i**0.3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333
