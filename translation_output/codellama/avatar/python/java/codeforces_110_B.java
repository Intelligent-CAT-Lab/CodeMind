<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

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



Translate the above python code to java.

java Code:

[/INST]
```java
import java.util.Scanner;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("abcd".repeat(n / 4) + "abc".substring(0, n % 4));
    }
}
```
This is a solution to the problem in Java. It uses the `Scanner` class to read the input, and the `String` class to perform the necessary operations. The `repeat` method is used to repeat the string "abcd" `n / 4` times, and the `substring` method is used to get the first `n % 4` characters of the string "abc". Finally, the result is printed to the console.</s>
