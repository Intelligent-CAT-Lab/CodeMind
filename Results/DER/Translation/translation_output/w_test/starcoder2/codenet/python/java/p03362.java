

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> p = makePrimeNums(2000);
        List<Integer> ans = new ArrayList<>();
        for (int pi : p) {
            if (pi % 10 == 1) {
                ans.add(pi);
            }
            if (ans.size() == n) {
                break;
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i));
            if (i != ans.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static List<Integer> makePrimeNums(int n) {
        List<Integer> primeNums = new ArrayList<>();
        if (n >= 2) {
            primeNums.add(2);
        }
        for (int i = 3; i <= n; i++) {
            for (int p : primeNums) {
                if (p >= Math.sqrt(i) + 1) {
                    primeNums.add(i);
                    break;
                }
                if (i % p == 0) {
                    break;
                }
            }
        }
        return primeNums;
    }
}
```

## 1.2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import sys
import math
import collections
import bisect
import itertools

# import numpy as np

sys.setrecursionlimit(10 ** 7)
INF = 10 ** 16
MOD = 10 ** 9 + 7
# MOD = 998244353

ni = lambda: int(sys.stdin.readline().rstrip())
ns = lambda: map(int, sys.stdin.readline().rstrip().split())
na = lambda: list(map(int, sys.stdin.readline().rstrip().split()))
na1 = lambda: list(map(lambda x: int(x) - 1, sys.stdin.readline().rstrip().split()))


# ===CODE===

def main():
    print(MOD)


if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 1.3. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import sys
import math
import collections
import bisect
import itertools

# import numpy as np

sys.setrecursionlimit(10 ** 7)
INF = 10 ** 16
MOD = 10 ** 9 + 7
# MOD = 998244353

ni = lambda: int(sys.stdin.readline().rstrip())
ns = lambda: map(int, sys.stdin.readline().rstrip().split())
na = lambda: list(map(int, sys.stdin.readline().rstrip().split()))
na1 = lambda: list(map(lambda x: int(x) - 1, sys.stdin.readline().rstrip().split()))


# ===CODE===

def main():
    print(MOD)


if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```


```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int[] d = new int[m];
        for (int i = 0; i < m; i++) {
            d[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j] && c[i] == d[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 1.2. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import sys
import math
import collections
import bisect
import itertools

# import numpy as np

sys.setrecursionlimit(10 ** 7)
INF = 10 ** 16
MOD = 10 ** 9 + 7
# MOD = 998244353

ni = lambda: int(sys.stdin.readline().rstrip())
ns = lambda: map(int, sys.stdin.readline().rstrip().split())
na = lambda: list(map(int, sys.stdin.readline().rstrip().split()))
na1 = lambda: list(map(lambda x: int(x) - 1, sys.stdin.readline().rstrip().split()))


# ===CODE===

def main():
    print(MOD)


if __name__ == '__main__':
    main()

```

java code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }

