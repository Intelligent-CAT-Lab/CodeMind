<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
abcdabcdabcdJbcCabcda'cda$cgabcdabcdxbcdabcdabcdabcdabcdab'gahcdab,da0cdabcdabcdabcdabcdab>dabc^abcd

```
from collections import defaultdict , deque
from functools import lru_cache
from heapq import heappush , heappop
from bisect import bisect_right , bisect_left
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
sys . setrecursionlimit ( 1 << 30 )
threading . stack_size ( 1 << 27 )
thread = threading . Thread ( target = main )
thread . start ( ) ; thread . join ( )


```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(repeatString("abcd", n / 4) + repeatString("abc", n % 4));
    }

    public static String repeatString(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then prints a string that is the result of repeating "abcd" times (n / 4) and then appending "abc" times (n % 4). The `repeatString` method is used to repeat a string a certain number of times.<｜end▁of▁sentence｜>
