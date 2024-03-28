<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A, B = map(int, input().split())
f = False
ans = 0
n = A * 100 // 8
m = (A + 1) * 100 // 8
for i in range(n, m + 1):
  if i * 8 // 100 == A and i // 10 == B:
    f = True
    ans = i
    break
print(ans if f else -1)

```

### Input

The first line contains two integers, $A$ and $B$ ($1 \leq A, B \leq 10^9$).

### Output

Print the answer to the problem or -1 if there is no solution.

### Constraints

- $1 \leq A, B \leq 10^9$

### Sample Input

```
1 1
```

### Sample Output

```
100
```

### Explanation

The only solution is $100$.

### Hint

- Use the `map` function to convert the input to a list of integers.
- Use the `range` function to iterate over the range of numbers.
- Use the `//` operator to perform integer division.
- Use the `==` operator to compare two integers.
- Use the `break` statement to exit the loop.
- Use the `if` statement to check if a condition is true.
- Use the `print` statement to output the answer.
</s>
