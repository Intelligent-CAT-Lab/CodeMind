<s> Translate the following python code to java and enclose your solution inside ```java```:
```
x, y = map(int, input().split())
count = 0
for a in range(x+1):
    b = x - a
    if (2*a + 4*b) == y:
        count = 1
        break
    else:
        pass
print("Yes" if count == 1 else "No")
```

### Input

The first line of input contains two integers $x$ and $y$ ($1 \leq x, y \leq 10^5$).

### Output

Print "Yes" if there exists a pair of integers $a$ and $b$ such that $2a + 4b = y$ and $1 \leq a, b \leq x$, otherwise print "No".

### Constraints

- $1 \leq x, y \leq 10^5$

### Sample Input

```
3 10
```

### Sample Output

```
Yes
```

### Explanation

The only pair of integers $a$ and $b$ such that $2a + 4b = 10$ and $1 \leq a, b \leq 3$ is $(a, b) = (1, 3)$.

### Hint

- Use the `for` loop to iterate over all possible pairs of integers $a$ and $b$ such that $1 \leq a, b \leq x$.
- Use the `if` statement to check if $2a + 4b = y$.
- Use the `break` statement to exit the `for` loop if the condition is satisfied.
</s>
