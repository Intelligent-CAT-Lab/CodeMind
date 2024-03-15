<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.io.*;

public class Main {
    static int INF = Integer.MAX_VALUE;
    static int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

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
