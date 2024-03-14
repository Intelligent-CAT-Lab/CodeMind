<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
            int b = n - i;
            ans = Math.min(ans, dsum(i) + dsum(b));
        }
        System.out.println(ans);
    }
    public static int dsum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
```
<|endoftext|>
