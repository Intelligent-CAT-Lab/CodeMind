<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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


```
[/INST]
```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static int mod = 1000000007;
    static double inf = Double.POSITIVE_INFINITY;

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
```</s>
