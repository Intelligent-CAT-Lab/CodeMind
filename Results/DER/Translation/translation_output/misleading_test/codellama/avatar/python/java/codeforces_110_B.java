<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]

Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String output = "";
        for (int i = 0; i < n / 4; i++) {
            output += "abcd";
        }
        output += "abc"[n % 4];
        System.out.println(output);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `Arrays` class to create the output string. The `for` loop iterates over the input number `n` and appends the string "abcd" to the output string `output` `n / 4` times, and then appends the string "abc" with the index `n % 4` to the output string. Finally, the output string is printed to the console using `System.out.println()`.</s>
