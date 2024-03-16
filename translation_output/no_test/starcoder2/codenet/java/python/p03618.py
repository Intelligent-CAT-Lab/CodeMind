
```
import sys

A = sys.stdin.readline().strip()
N = len(A)
cnt = [0] * 26
for i in range(N):
    cnt[ord(A[i]) - ord('a')] += 1

ans = N * (N + 1) // 2 + 1
for i in range(26):
    if cnt[i] > 0:
        ans -= cnt[i] * (cnt[i] + 1) // 2

print(ans)
```

## 3619 - 1000000007

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03619 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++)
            A[i] = sc.nextInt();
        
        int ans = 0;
        for(int i=0; i<N; i++) {
            int x = A[i];
            for(int j=i+1; j<N; j++)
                if(A[j]%x==0)
                    ans++;
        }
        
        System.out.println(ans);
        
        sc.close();
    }
}

```

python code:
```
import sys

N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))

ans = 0
for i in range(N):
    x = A[i]
    for j in range(i + 1, N):
        if A[j] % x == 0:
            ans += 1

print(ans)
```

## 3620 - 1000000007

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++)
            A[i] = sc.nextInt();
        
        int ans = 0;
        for(int i=0; i<N; i++) {
            int x = A[i];
            for(int j=i+1; j<N; j++)
                if(A[j]%x==0)
                    ans++;
        }
        
        System.out.println(ans);
        
        sc.close();
    }
}

```

python code:
```
import sys

N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))

ans = 0
for i in range(N):
    x = A[i]
    for j in range(i + 1, N):
        if A[j] % x == 0:
            ans += 1

print(ans)
```

## 3621 - 1000000007

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03621 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++)
            A[i] = sc.nextInt();
        
        int ans = 0;
        for(int i=0; i<N; i++) {
            int x = A[i];
            for(int j=i+1; j<N; j++)
                if(A[j]%x==0)
                    ans++;
        }
        
        System.out.println(ans);
        
        sc.close();
    }
}

```

python code:
```
import sys

N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))

ans = 0
for i in range(N):
    x = A[i]
    for j in range(i + 1, N):
        if A[j] % x == 0:
            ans += 1

print(ans)
```

## 3622 - 1000000007

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++)
            A[i] = sc.nextInt();
        
        int ans = 0;
        for(int i=0; i<N; i++) {
            int x = A[i];
            for(int j=i+1; j<N; j++)
                if(A[j]%x==0)
                    ans++;
        }
        
        System.out.println(ans);
        
        sc.close();
    }
}

```

python code:
```
import sys

N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))

ans = 0
for i in range(N):
    x = A[i]
    for j in range(i + 1, N):
        if A[j] % x == 0:
            ans += 1

print(ans)
```

## 3623 - 1000000007

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++)
            A[i] = sc.nextInt();
        
        int ans = 0;
        for(int i=0; i<N; i++) {
            int x = A[i];
            for(int j=i+1; j<N; j++)
                if(A[j]%x==0)
                    ans++;
        }
        
        System.out.println(ans);
        
        sc.close();
    }
}

```

python code:
```
import sys

N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))

ans = 0
for i in range(N):
    x = A[i]
    for j in range(i + 1, N):
        if A[j] % x == 0:
            ans += 1

print(ans)
```

## 3624 - 1000000007

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i
