<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9

Expected output:
15

```
from collections import defaultdict, deque
import sys, heapq, bisect, math, itertools, string, queue, datetime
sys. setrecursionlimit ( 10 ** 8 )
INF = float ('inf')
mod = 10 ** 9 + 7
def inpl ( ) : return list ( map ( int, input ( ). split ( ) ) )
def inpls ( ) : return list ( input ( ). split ( ) )
N = int ( input ( ) )
def dsum ( x ) :
    return sum ( map ( int, list ( str ( x ) ) ) )
ans = INF
for a in range ( 1, N ) :
    b = N - a
    ans = min ( ans, dsum ( a ) + dsum ( b ) )
print ( ans )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int a = i, b = n - i;
            ans = Math.min(ans, a + b);
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
