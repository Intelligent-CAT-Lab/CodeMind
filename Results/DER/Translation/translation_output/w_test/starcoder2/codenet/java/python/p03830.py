

```python
import math

MOD = 1000000007
N = int(input())
cnt = [0] * (N+1)
for i in range(2, N+1):
    temp = i
    for j in range(2, int(math.sqrt(temp))+1):
        while temp % j == 0:
            cnt[j] += 1
            temp //= j
    if temp > 1:
        cnt[temp] += 1

ans = 1
for i in range(2, N+1):
    ans = (ans * (cnt[i]+1)) % MOD

print(ans)
```

## 03831

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;

public class p03831 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long ans = 0;
        for(long i=1; i*i<=N; i++) {
            if(N%i==0) {
                ans = Math.max(ans, i);
                ans = Math.max(ans, N/i);
            }
        }
        
        System.out.println(ans);
        sc.close();
    }
}

```

python code:

```python
N = int(input())
ans = 0
for i in range(1, int(N**0.5)+1):
    if N % i == 0:
        ans = max(ans, i)
        ans = max(ans, N//i)

print(ans)
```

## 03832

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;

public class p03832 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long ans = 0;
        for(long i=1; i*i<=N; i++) {
            if(N%i==0) {
                ans = Math.max(ans, i);
                ans = Math.max(ans, N/i);
            }
        }
        
        System.out.println(ans);
        sc.close();
    }
}

```

python code:

```python
N = int(input())
ans = 0
for i in range(1, int(N**0.5)+1):
    if N % i == 0:
        ans = max(ans, i)
        ans = max(ans, N//i)

print(ans)
```

## 03833

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;

public class p03833 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long ans = 0;
        for(long i=1; i*i<=N; i++) {
            if(N%i==0) {
                ans = Math.max(ans, i);
                ans = Math.max(ans, N/i);
            }
        }
        
        System.out.println(ans);
        sc.close();
    }
}

```

python code:

```python
N = int(input())
ans = 0
for i in range(1, int(N**0.5)+1):
    if N % i == 0:
        ans = max(ans, i)
        ans = max(ans, N//i)

print(ans)
```

## 03834

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;

public class p03834 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long ans = 0;
        for(long i=1; i*i<=N; i++) {
            if(N%i==0) {
                ans = Math.max(ans, i);
                ans = Math.max(ans, N/i);
            }
        }
        
        System.out.println(ans);
        sc.close();
    }
}

```

python code:

```python
N = int(input())
ans = 0
for i in range(1, int(N**0.5)+1):
    if N % i == 0:
        ans = max(ans, i)
        ans = max(ans, N//i)

print(ans)
```

## 03835

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;

public class p03835 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long ans = 0;
        for(long i=1; i*i<=N; i++) {
            if(N%i==0) {
                ans = Math.max(ans, i);
                ans = Math.max(ans, N/i);
            }
        }
        
        System.out.println(ans);
        sc.close();
    }
}

```

python code:

```python
N = int(input())
ans = 0
for i in range(1, int(N**0.5)+1):
    if N % i == 0:
        ans = max(ans, i)
        ans = max(ans, N//i)

print(ans)
```

## 03836

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000
