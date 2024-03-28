<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9

Expected output:
9


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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static int mod = (int)Math.pow(10, 9) + 7;

    static int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = INF;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            ans = Math.min(ans, digitSum(a) + digitSum(b));
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It calculates the sum of the digits of two numbers `a` and `b` such that `a + b = N` and `a` and `b` are as small as possible. The `digitSum` function calculates the sum of the digits of a number. The `main` function reads the input `N` and calculates the minimum sum of the digits of `a` and `b`.
<|EOT|>
