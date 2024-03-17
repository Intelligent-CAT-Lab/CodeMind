Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9

Expected output:
9


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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            ans = Math.min(ans, digitSum(a) + digitSum(b));
        }
        System.out.println(ans);
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
```<|endoftext|>
