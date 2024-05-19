System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            int sum = 0;
            int tmp = a;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            tmp = b;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            ans = Math.min(ans, sum);
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
