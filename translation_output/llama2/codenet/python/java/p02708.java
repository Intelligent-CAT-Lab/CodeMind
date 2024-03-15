<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n, k = map(int, input().split())
ans=0
for i in range(k,n+2):
    ans+=(((2*n-i+1)*i)//2)-(i*(i-1)//2)+1
print(ans%(10**9+7))
```

### Input

The first line of input contains two integers, $n$ and $k$.

### Output

Print the answer modulo $10^9+7$.

### Constraints

$1 \leq n \leq 10^5$

$1 \leq k \leq n$

### Sample Input

```
4 2
```

### Sample Output

```
1
```

### Explanation

The answer is $1$.

### Hint

Use the formula for the sum of the first $n$ terms of the sequence $a_n = \frac{n(n+1)}{2}$.
</s>
