<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9

Expected output:
15

```
from collections import defaultdict , deque
import sys , heapq , bisect , math , itertools , string , queue , datetime
sys . setrecursionlimit ( 10 ** 8 )
INF = float ( ' inf ' )
mod = 10 ** 9 + 7
def inpl ( ) : return list ( map ( int , input ( ) . split ( ) ) )
def inpls ( ) : return list ( input ( ) . split ( ) )
N = int ( input ( ) )
def dsum ( x ) :
    return sum ( map ( int , list ( str ( x ) ) ) )
ans = INF
for a in range ( 1 , N ) :
    b = N - a
    ans = min ( ans , dsum ( a ) + dsum ( b ) )
print ( ans )


```
[/INST]
```java
import java.util.*;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static int mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = INF;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            ans = Math.min(ans, dsum(a) + dsum(b));
        }
        System.out.println(ans);
    }

    static int dsum(int x) {
        return x;
    }
}
```</s>
