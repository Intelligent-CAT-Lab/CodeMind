<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n,k = map(int, input().split())
if k > n:
    print(0)
    quit()
ans = 1
for i in range(1,k):
    ans *= n-i
    ans //= i
ans %= 1000000007
print(ans)

```

### Input

The first line of input contains two integers, $n$ and $k$.

### Output

Print the answer modulo $10^9 + 7$.

### Constraints

$1 \leq n \leq 10^5$

$1 \leq k \leq n$

### Example

```
Input:
n = 5
k = 3

Output:
1

Explanation:
The answer is 1.
```

### Hint

Use the formula for the sum of the first $k$ terms of the sequence $1,2,3,...n$.
</s>
