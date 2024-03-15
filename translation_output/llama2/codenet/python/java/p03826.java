<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c,d = map(int, input().split())
s = a*b
t = c*d
if s > t: print(s)
else: print(t)
```

### Input

The first line contains an integer $n$ ($1 \leq n \leq 10^5$) denoting the number of test cases.

The first line of each test case contains four space-separated integers $a,b,c,d$ ($1 \leq a,b,c,d \leq 10^9$).

### Output

For each test case, print the larger of $s$ and $t$ on a new line.

### Constraints

- $1 \leq n \leq 10^5$
- $1 \leq a,b,c,d \leq 10^9$

### Sample Input

```
3
1 2 3 4
2 3 4 5
3 4 5 6
```

### Sample Output

```
12
20
```

### Explanation

- In the first test case, $s = 12$ and $t = 10$.
- In the second test case, $s = 20$ and $t = 15$.
- In the third test case, $s = 30$ and $t = 36$.

### Hint

- Use the `map` function to convert the input to integers.
- Use the `if` statement to compare the values of $s$ and $t$.
- Use the `print` statement to print the larger of $s$ and $t$.
</s>
