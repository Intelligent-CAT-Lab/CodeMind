

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            HashMap<Integer, Integer> f = factorization(i);
            for (Map.Entry<Integer, Integer> e : f.entrySet()) {
                int k = e.getKey();
                int v = e.getValue();
                if (d.containsKey(k)) {
                    d.put(k, d.get(k) + v);
                } else {
                    d.put(k, v);
                }
            }
        }
        long r = 1;
        for (Map.Entry<Integer, Integer> e : d.entrySet()) {
            r *= e.getValue() + 1;
            r %= 1000000007;
        }
        System.out.println(r);
    }

    public static HashMap<Integer, Integer> factorization(int n) {
        HashMap<Integer, Integer> buff = new HashMap<>();
        int c = 0;
        while (n % 2 == 0) {
            c++;
            n /= 2;
        }
        if (c > 0) {
            buff.put(2, c);
        }
        c = 0;
        while (n % 3 == 0) {
            c++;
            n /= 3;
        }
        if (c > 0) {
            buff.put(3, c);
        }
        int x = 5;
        while (n >= x * x) {
            c = 0;
            while (n % x == 0) {
                c++;
                n /= x;
            }
            if (c > 0) {
                buff.put(x, c);
            }
            if (x % 6 == 5) {
                x += 2;
            } else {
                x += 4;
            }
        }
        if (n > 1) {
            buff.put(n, 1);
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

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}

```

## 11. 1000000007

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

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}

```

## 12. 1000000007

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

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}

```

## 13. 1000000007

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

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(1000000007);
    }
}

```

## 14. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
10
