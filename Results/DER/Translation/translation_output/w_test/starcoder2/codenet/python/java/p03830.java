

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (int[] kv : factorization(i)) {
                int k = kv[0];
                int v = kv[1];
                d.put(k, d.getOrDefault(k, 0) + v);
            }
        }
        long r = 1;
        for (int c : d.values()) {
            r *= c + 1;
            r %= 1000000007;
        }
        System.out.println(r);
    }

    static List<int[]> factorization(int n) {
        List<int[]> buff = new ArrayList<>();
        int c, m;
        c = m = 0;
        while (n % 2 == 0) {
            c++;
            n /= 2;
        }
        if (c > 0) {
            buff.add(new int[]{2, c});
        }
        c = m = 0;
        while (n % 3 == 0) {
            c++;
            n /= 3;
        }
        if (c > 0) {
            buff.add(new int[]{3, c});
        }
        int x = 5;
        while (n >= x * x) {
            c = m = 0;
            while (n % x == 0) {
                c++;
                n /= x;
            }
            if (c > 0) {
                buff.add(new int[]{x, c});
            }
            if (x % 6 == 5) {
                x += 2;
            } else {
                x += 4;
            }
        }
        if (n > 1) {
            buff.add(new int[]{n, 1});
        }
        return buff;
    }
}
```

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time

sys.setrecursionlimit(10**7)
inf = 10**20
mod = 10**9 + 7

def LI(): return list(map(int, input().split()))
def II(): return int(input())
def LS(): return input().split()
def S(): return input()

def main():
    return mod

print(main())

```

java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}
```

## 11. 1000000006

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000006

Expected output:
1000000006


```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time

sys.setrecursionlimit(10**7)
inf = 10**20
mod = 10**9 + 7

def LI(): return list(map(int, input().split()))
def II(): return int(input())
def LS(): return input().split()
def S(): return input()

def main():
    return mod-1

print(main())

```

java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000006);
    }
}
```

## 12. 1000000005

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000005

Expected output:
1000000005


```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time

sys.setrecursionlimit(10**7)
inf = 10**20
mod = 10**9 + 7

def LI(): return list(map(int, input().split()))
def II(): return int(input())
def LS(): return input().split()
def S(): return input()

def main():
    return mod-2

print(main())

```

java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000005);
    }
}
```

## 13. 1000000004

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000004

Expected output:
1000000004


```
import math,string,itertools,fractions,heapq,collections,re,array,bisect,sys,random,time

sys.setrecursionlimit(10**7)
inf = 10**20
mod = 10**9 + 7

def LI(): return list(map(int, input().split()))
def II(): return int(input())
def LS(): return input().split()
def S(): return input()

def main():
    return mod-3

print(main())

```

java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000004);
    }
}
```

## 14. 1000000003

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000003

Expected output:
1000000003


```
import math,string,itertools,fractions,heapq,collections
