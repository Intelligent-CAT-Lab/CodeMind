

```python
import sys

def solve(N, x):
    ans = [0 for i in range(2*N-1)]
    if N == 2:
        return [1, 2, 3]
    if x == 2:
        ans[N-2] = 2*N-1
        ans[N-1] = 2
        ans[N] = 1
        ans[N+1] = 2*N-2
        elm = 3
        for index in range(2*N-1):
            if ans[index] == 0:
                ans[index] = elm
                elm += 1
    else:
        ans[N-2] = 1
        ans[N-1] = x
        ans[N] = 2*N-1
        ans[N+1] = 2
        elm = 3
        for index in range(2*N-1):
            if elm == x:
                elm += 1
            if ans[index] == 0:
                ans[index] = elm
                elm += 1
    return ans

N, x = map(int, sys.stdin.readline().split())

if x == 1 or x == 2*N-1:
    print("No")
else:
    print("Yes")
    ans = solve(N, x)
    for i in range(2*N-1):
        print(ans[i])
```

## 03953

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3
1 2 3

Expected output:
1
2
3


```
import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class p03953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];
        for(int i=0; i<M; i++) A[i] = sc.nextInt();

        int[] ans = new int[N];
        for(int i=0; i<M; i++){
            ans[A[i]-1]++;
        }
        for(int i=0; i<N; i++) System.out.println(ans[i]);
    }
}

```

python code:

```python
import sys

N, M = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))

ans = [0 for i in range(N)]
for i in range(M):
    ans[A[i]-1] += 1
for i in range(N):
    print(ans[i])
```

## 03954

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class p03954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(N);
    }
}

```

python code:

```python
import sys

N = int(sys.stdin.readline())
print(N)
```

## 03955

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class p03955 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(N);
    }
}

```

python code:

```python
import sys

N = int(sys.stdin.readline())
print(N)
```

## 03956

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class p03956 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(N);
    }
}

```

python code:

```python
import sys

N = int(sys.stdin.readline())
print(N)
```

## 03957

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class p03957 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        System.out.println(N);
    }
}

```

python code:

```python
import sys

N = int(sys.stdin.readline())
print(N)
```

## 03958

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100000000
