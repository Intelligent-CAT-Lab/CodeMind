

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String D = sc.next();
        int N = D.length();
        int[] DI = new int[N];
        for (int i = 0; i < N; i++) {
            DI[i] = D.charAt(i) - '0';
        }
        int su = 0;
        for (int i = 0; i < N; i++) {
            su += DI[i];
        }
        int pd = 1;
        for (int i = 0; i < N; i++) {
            pd *= DI[i] + 1;
        }
        Map<Integer, Integer>[] memo = new Map[N];
        for (int i = 0; i < N; i++) {
            memo[i] = new HashMap<>();
        }
        int dfs0(int i, int s, int p) {
            int key = (s << 16) | p;
            if (i == N) {
                return s > 0 || (s == 0 && p < pd);
            }
            if (memo[i].containsKey(key)) {
                return memo[i].get(key);
            }
            int r = 0;
            for (int v = Math.min(s, 9); v >= 0; v--) {
                r += dfs0(i+1, s-v, p*(v+1));
            }
            memo[i].put(key, r);
            return r;
        }
        int res1 = dfs0(0, su, 1);
        Map<Integer, Integer>[] memo1 = new Map[N];
        for (int i = 0; i < N; i++) {
            memo1[i] = new HashMap<>();
        }
        int dfs1(int i, int s, int p, int m) {
            int key = (s << 16) | (p << 8) | m;
            if (i == N) {
                return s == 0 && p == 1;
            }
            if (memo1[i].containsKey(key)) {
                return memo1[i].get(key);
            }
            int r = 0;
            int b = s - (N-1-i)*9;
            int di = DI[i];
            for (int v = Math.min(s, 9); v >= Math.max(b, 0); v--) {
                if (p % (v+1) != 0) {
                    continue;
                }
                if (m == 0) {
                    if (di < v) {
                        break;
                    }
                    r += dfs1(i+1, s-v, p/(v+1), +(v < di));
                } else {
                    r += dfs1(i+1, s-v, p/(v+1), 1);
                }
            }
            memo1[i].put(key, r);
            return r;
        }
        int res2 = dfs1(0, su, pd, 0) - 1;
        int ans = res1 + res2;
        System.out.println(ans);
    }
}
```

## 2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007

```
def solve():
    N = int(input())
    print(N)
solve()
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }
}
```

## 3. 1000000008

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000008

Expected output:
1000000008

```
def solve():
    N = int(input())
    print(N)
solve()
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }
}
```

## 4. 1000000009

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000009

Expected output:
1000000009

```
def solve():
    N = int(input())
    print(N)
solve()
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }
}
```

## 5. 1000000010

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000010

Expected output:
1000000010

```
def solve():
    N = int(input())
    print(N)
solve()
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }
}
```

## 6. 1000000011

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000011

Expected output:
1000000011

```
def solve():
    N = int(input())
    print(N)
solve()
```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(N);
    }
