

```python
import math

n, k = map(int, input().split())

if k >= n:
    print(math.comb(n + n - 1, n - 1, mod=1000000007))
else:
    ans = 0
    for i in range(k + 1):
        up = math.comb(n, i, mod=1000000007) * math.comb(n - 1, i, mod=1000000007)
        down = math.comb(n, i, mod=1000000007) * math.comb(n - 1, i, mod=1000000007)
        ans += up * down
        ans %= 1000000007
    print(ans)
```

## Problem F: Fence

### Problem Description

You are given a sequence of n integers a1, a2, ..., an. You have to build a fence of n planks. The i-th plank has the height ai.

You have to build the fence in such a way that the height of each plank is equal to the number of planks that are higher than it.

For example, if n = 5 and a = [3, 1, 4, 1, 5], then the fence will look like this:

![fence](https://codeforces.com/predownloaded/8a/61/8a61991199119911991199119911991199119911.png)

Your task is to find any possible sequence of planks.

### Input

The first line contains a single integer n (1 ≤ n ≤ 100 000) — the number of planks.

### Output

Print n integers a1, a2, ..., an (0 ≤ ai ≤ n) — the sequence of planks. If there are multiple possible answers, you can print any of them.

### Sample Input 1

```
5
```

### Sample Output 1

```
3 1 4 1 5
```

### Sample Input 2

```
3
```

### Sample Output 2

```
2 0 1
```

### Sample Input 3

```
1
```

### Sample Output 3

```
0
```

### Sample Input 4

```
10
```

### Sample Output 4

```
9 8 7 6 5 4 3 2 1 0
```

### Sample Input 5

```
10
```

### Sample Output 5

```
9 8 7 6 5 4 3 2 1 0
```

### Sample Input 6

```
10
```

### Sample Output 6

```
9 8 7 6 5 4 3 2 1 0
```

### Sample Input 7

```
10
```

### Sample Output 7

```
9 8 7 6 5 4 3 2 1 0
```

### Sample Input 8

```
10
```

### Sample Output 8

```
9 8 7 6 5 4 3 2 1 0
```

### Sample Input 9

```
10
```

### Sample Output 9

```
9 8 7 6 5 4 3 2 1 0
```

### Sample Input 10

```
10
```

### Sample Output 10

```
9 8 7 6 5 4 3 2 1 0
```

### Sample Input 11

```
10
```

### Sample Output 11

```
9 8 7 6 5 4 3 2 1 0
```

### Sample Input 12

```
10
```

### Sample Output 12

```
9 8 7 6 5 4 3 2
