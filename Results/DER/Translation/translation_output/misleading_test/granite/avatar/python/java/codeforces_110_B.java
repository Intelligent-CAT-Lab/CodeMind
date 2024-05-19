System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "abcd";
        for(int i=0;i<n/4;i++)
        {
            System.out.print(s);
        }
        if(n%4==1)
        {
            System.out.print("a");
        }
        else if(n%4==2)
        {
            System.out.print("ab");
        }
        else if(n%4==3)
        {
            System.out.print("abc");
        }
    }
}
```

Test case:
```
100
```

Expected Output:
```
abcdabcdabcdJbcCabcda'cda$cgabcdabcdxbcdabcdabcdabcdabcdabcdab'gahcdab,da0cdabcdabcdabcdabcdab>dabc^abcd
```<|endoftext|>
