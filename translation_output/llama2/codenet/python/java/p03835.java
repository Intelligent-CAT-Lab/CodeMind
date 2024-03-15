<s> Translate the following python code to java and enclose your solution inside ```java```:
```
k,s=map(int,input().split())
print(sum(0<=s-y-z<=k for z in range(k+1) for y in range(k+1)))
```

### Input

The first line of input contains two integers $k$ and $s$ ($1 \leq k \leq 10^5$ and $1 \leq s \leq 10^5$).

### Output

Print the sum of the number of ways to choose $z$ such that $0 \leq s-y-z \leq k$ for all $y$ in the range $1 \leq y \leq k$.

### Constraints

- $1 \leq k \leq 10^5$
- $1 \leq s \leq 10^5$

### Sample Input

```
3 2
```

### Sample Output

```
1
```

### Explanation

There is only one way to choose $z$ such that $0 \leq s-y-z \leq k$ for all $y$ in the range $1 \leq y \leq k$.

### Hint

Use a for loop to iterate over all possible values of $z$.
</s>
