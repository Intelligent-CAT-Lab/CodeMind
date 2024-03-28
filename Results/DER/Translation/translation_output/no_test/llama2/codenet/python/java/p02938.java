<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from functools import *
MOD=10**9+7
@lru_cache(maxsize=None)
def solve(L,R):
  if L > R: return 0
  if L == 1: return (1 + solve(2, R)) % MOD
  return (solve(L//2,(R-1)//2) + solve((L+1)//2,R//2) + solve((L+1)//2,(R-1)//2)) % MOD
  
print(solve(*map(int,input().split())))
```

### Input

The first line contains an integer $T$ denoting the number of test cases.

The first line of each test case contains two integers $L$ and $R$ denoting the lower and upper bounds of the range.

### Output

For each test case, print the answer modulo $10^9+7$.

### Constraints

$1 \leq T \leq 10^5$

$1 \leq L,R \leq 10^9$

### Example Input

```
3
1 10
1 100
1 1000
```

### Example Output

```
1
1
1
```

### Explanation

```
1 10
1 100
1 1000
```

### Hint

- Use the [LRU cache](https://en.wikipedia.org/wiki/Cache_algorithms#Least_recently_used_(LRU)) to solve this problem.
- Use the [modulo operation](https://en.wikipedia.org/wiki/Modulo_operation) to get the answer.
</s>
