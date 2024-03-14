<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
def fib(n):
    memo = [0] * n
    memo[0:2] = [2, 1]
    for i in range(2, n):
        memo[i] = memo[i - 1] + memo[i - 2]
    return memo[n - 1]


def solve():
    N = int(input())
    print(fib(N + 1))
    

solve()
```

java code:<fim_suffix><fim_middle>
```java
```

"""
<|endoftext|>
