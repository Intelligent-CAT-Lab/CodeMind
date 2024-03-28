

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            int x = n / i;
            ans += i * (1 + x) * x / 2;
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000;
        int[] prime = new int[n + 1];
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (prime[i] == 1) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```

## 3.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000;
        int[] prime = new int[n + 1];
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (prime[i] == 1) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```

## 4.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000;
        int[] prime = new int[n + 1];
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) {
                for (int j = 2; i * j <= n; j++) {
                    prime[i * j] = 0;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (prime[i] == 1) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```


```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

```

```

## 3.

Write a program to find the sum of the first 1000 prime numbers.

```

```

## 4.

Write a program to find the sum of the first 1000 prime numbers.

```

```
/README.md
# Java-Programming-Practice

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9995083

Expected output:
837779626111677

```
from collections import defaultdict , deque
from heapq import heappush , heappop
from bisect import bisect_left , bisect_right
import sys , random , itertools , math
sys . setrecursionlimit ( 10 ** 5 )
input = sys . stdin . readline
sqrt = math . sqrt
def LI ( ) : return list ( map ( int , input ( ) . split ( ) ) )
def LF ( ) : return list ( map ( float , input ( ) . split ( ) ) )
def LI_ ( ) : return list ( map ( lambda x : int ( x ) - 1 , input ( ) . split ( ) ) )
def II ( ) : return int ( input ( ) )
def IF ( ) : return float ( input ( ) )
def S ( ) : return input ( ) . rstrip ( )
def LS ( ) : return S ( ) . split ( )
def IR ( n ) : return [ II ( ) for _ in range ( n ) ]
def LIR ( n ) : return [ LI ( ) for _ in range ( n ) ]
def FR ( n ) : return [ IF ( ) for _ in range ( n ) ]
def LFR ( n ) : return [ LI ( ) for _ in range ( n ) ]
def LIR_ ( n ) : return [ LI_ ( ) for _ in range ( n ) ]
def SR ( n ) : return [ S ( ) for _ in range ( n ) ]
def LSR ( n ) : return [ LS ( ) for _ in range ( n ) ]
mod = 1000000007
inf = float ( " INF " )
def solve ( ) :
    n = II ( )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        x = n // i
        ans += i * ( 1 + x ) * x // 2
    print ( ans )
    return
if __name__ == ' _ _ main _ _ ' :
    solve ( )

