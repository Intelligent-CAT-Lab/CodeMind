<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from math import ceil, floor, log2
import sys

n, a = map(int, next(sys.stdin).strip().split())

t = n
for k in range(1, ceil(log2(n))):
    d = ceil(n ** (1 / k))
    l = 0
    r = k
    while l + 1 < r:
        c = (l + r) // 2
        if n <= (d - 1) ** (k - c) * d ** c:
            r = c
        else:
            l = c
    t = min(t, (d - 1) * (k - r) + d * r + (k - 1) * a)
print(t)

```

### Input

- The first line contains two integers, $n$ and $a$.
- $1 \leq n \leq 10^9$
- $1 \leq a \leq 10^9$

### Output

- Print a single integer, the minimum number of operations required to sort the array.

### Constraints

- 1 ≤ $n$ ≤ 10^9
- 1 ≤ $a$ ≤ 10^9

### Example

```
Input:
n = 10
a = 1

Output:
10

Explanation:
The array is already sorted.

Input:
n = 100
a = 10

Output:
100

Explanation:
The array is already sorted.

Input:
n = 1000
a = 100

Output:
1000

Explanation:
The array is already sorted.

Input:
n = 10000
a = 1000

Output:
10000

Explanation:
The array is already sorted.

Input:
n = 100000
a = 10000

Output:
100000

Explanation:
The array is already sorted.

Input:
n = 1000000
a = 100000

Output:
1000000

Explanation:
The array is already sorted.

Input:
n = 10000000
a = 1000000

Output:
10000000

Explanation:
The array is already sorted.

Input:
n = 100000000
a = 100000000

Output:
100000000

Explanation:
The array is already sorted.

Input:
n = 1000000000
a = 1000000000

Output:
1000000000

Explanation:
The array is already sorted.
```

### Hint

- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number of operations required to sort an array.
- Use the formula for the number
