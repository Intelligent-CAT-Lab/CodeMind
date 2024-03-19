<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(generateString(n));
    }

    private static String generateString(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n / 4; i++) {
            sb.append("abcd");
        }
        switch (n % 4) {
            case 1:
                sb.append("a");
                break;
            case 2:
                sb.append("ab");
                break;
            case 3:
                sb.append("abc");
                break;
        }
        return sb.toString();
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, generates a string of that length by repeating "abcd" and appending the appropriate number of "a", "ab", or "abc" to the end, and then prints the result.
<|EOT|>
