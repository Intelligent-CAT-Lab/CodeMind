<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

#!/usr/bin/env python3

import sys
import math
from bisect import bisect_right as br
from bisect import bisect_left as bl
sys.setrecursionlimit(2147483647)
from heapq import heappush, heappop,heappushpop
from collections import defaultdict
from itertools import accumulate
from collections import Counter
from collections import deque
from operator import itemgetter
from itertools import permutations
mod = 10**9 + 7
inf = float('inf')
def I(): return int(sys.stdin.readline())
def LI(): return list(map(int,sys.stdin.readline().split()))

t,x = LI()
print(t/x)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int x = scanner.nextInt();
        System.out.println(t / x);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `Math` class is used for mathematical operations, and the `Collections` class is used for sorting and searching. The `PriorityQueue` class is used for priority queues, and the `Deque` class is used for double-ended queues. The `List` and `ArrayList` classes are used for lists, and the `Map` and `HashMap` classes are used for maps. The `Set` and `HashSet` classes are used for sets, and the `Iterator` class is used for iterating over collections. The `stream.Collectors` class is used for collecting data from streams.</s>
