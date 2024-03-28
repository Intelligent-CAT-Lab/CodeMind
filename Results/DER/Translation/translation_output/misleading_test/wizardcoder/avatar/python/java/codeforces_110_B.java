Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
abcdabcdabcdJbcCabcda'cda$cgabcdabcdxbcdabcdabcdabcdabcdab'gahcdab,da0cdabcdabcdabcdabcdab>dabc^abcd

```
from collections import defaultdict, deque
from functools import lru_cache
from heapq import heappush, heappop
from bisect import bisect_right, bisect_left
import math
hpop = heappop
hpush = heappush
MOD = 10 ** 9 + 7
def solution ( ) :
    n = int ( input ( ) )
    print ( " abcd " * ( n // 4 ) + " abc " [ : n % 4 ] )
def main ( ) :
    t = 1
    for _ in range ( t ) :
        solution ( )
import sys
import threading
sys. setrecursionlimit ( 1 << 30 )
threading. stack_size ( 1 << 27 )
thread = threading. Thread ( target = main )
thread. start ( ) ; thread. join ( )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" abcd " * (n / 4) + " abc " + (n % 4 > 0? "d" : ""));
    }
}
```<|endoftext|>
