
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int ans = N;
        int ans2 = N;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                ans = Math.min(ans, Math.max(N - i - 1, i));
            } else {
                ans2 = Math.min(ans2, Math.max(N - i - 1, i));
            }
        }
        System.out.println(Math.max(ans, ans2));
    }
}
```

## 2. 
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
readline = sys.stdin.readline
sys.setrecursionlimit(10**8)
mod = 10**9+7
#mod = 998244353
INF = 10**18
eps = 10**-7

N = int(readline())
A = list(map(int,readline().split()))

ans = 0
for i in range(N):
    for j in range(i+1,N):
        if A[i] > A[j]:
            ans += 1
print(ans)
```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] > A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 3. 
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
readline = sys.stdin.readline
sys.setrecursionlimit(10**8)
mod = 10**9+7
#mod = 998244353
INF = 10**18
eps = 10**-7

N = int(readline())
A = list(map(int,readline().split()))

ans = 0
for i in range(N):
    for j in range(i+1,N):
        for k in range(j+1,N):
            if A[i] == A[j] and A[j] == A[k]:
                ans += 1
print(ans)
```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (A[i] == A[j] && A[j] == A[k]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 4. 
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
readline = sys.stdin.readline
sys.setrecursionlimit(10**8)
mod = 10**9+7
#mod = 998244353
INF = 10**18
eps = 10**-7

N = int(readline())
A = list(map(int,readline().split()))

ans = 0
for i in range(N):
    for j in range(i+1,N):
        for k in range(j+1,N):
            for l in range(k+1,N):
                if A[i] == A[j] and A[j] == A[k] and A[k] == A[l]:
                    ans += 1
print(ans)
```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    for (int l = k + 1; l < N; l++) {
                        if (A[i] == A[j] && A[j] == A[k] && A[k] == A[l]) {
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 5. 
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
readline = sys.stdin.readline
sys.setrecursionlimit(10**8)
mod = 10**9+7
#mod = 998244353
INF = 10**18
eps = 10**-7

N = int(readline())
A = list(map(int,readline().split()))

ans = 0
for i in range(N):
    for j in range(i+1,N):
        for k in range(j+1,N):
            for l in range(k+1,N):
                for m in range(l+1,N):
                    if A[i] == A[j] and A[j] == A[k] and A[k] == A[l] and A[l] == A[m]:
                        ans += 1
print(ans)
```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    for (int l = k + 1; l < N; l++) {
                        for (int m = l + 1; m < N; m++) {
                            if (A[i] == A[j] && A[j] == A[k] && A[k] == A[l] && A[l] == A[m]) {
                                ans++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 6. 
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
readline = sys.
