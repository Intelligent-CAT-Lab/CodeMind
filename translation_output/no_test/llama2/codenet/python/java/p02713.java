<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from math import gcd
K = int(input())
ans = 0

for a in range(1, K+1):
    for b in range(1, K+1):
        for c in range(1, K+1):
            ans += gcd(gcd(a, b), c)

print(ans)
```

### Input

The first line contains an integer `K` denoting the number of test cases.

The next `K` lines contain an integer `a` each.

### Output

For each test case, print the answer to the problem.

### Constraints

1 <= `K` <= 100

1 <= `a` <= 1000

### Example Input

```
3
10
20
30
```

### Example Output

```
10
10
10
```

### Explanation

The first test case is:

```
10
20
30
```

The answer is `10`.

The second test case is:

```
10
20
30
```

The answer is `10`.

The third test case is:

```
10
20
30
```

The answer is `10`.
</s>
