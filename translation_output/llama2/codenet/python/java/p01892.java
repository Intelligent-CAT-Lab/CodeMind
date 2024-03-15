<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, n = map(int, input().split())
score = abs(a - b)
for x in range(1, n + 1):
  for y in range(1, n + 1):
    if b * x % y == 0:
      new_a = b * x // y
      score = min(score, abs(a - new_a))
print(score)

```

### Input

- The first line contains three integers, $a$, $b$, and $n$ ($1 \leq a, b, n \leq 10^9$).
- The second line contains a single integer, $k$ ($1 \leq k \leq 10^9$).

### Output

- Print a single integer, the minimum distance between $a$ and $b$ such that $b$ is divisible by $k$.

### Constraints

- $1 \leq a, b, n \leq 10^9$
- $1 \leq k \leq 10^9$

### Sample Input

```
1 2 1000000000
1000000000
```

### Sample Output

```
1000000000
```

### Explanation

- The minimum distance between $a$ and $b$ is $1000000000$.

### Hint

- Use the `abs()` function to find the absolute value of a number.
- Use the `min()` function to find the minimum of two numbers.
- Use the `range()` function to generate a sequence of numbers.
- Use the `//` operator to perform integer division.
</s>
