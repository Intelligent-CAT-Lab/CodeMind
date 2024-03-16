<s> Translate the following python code to java and enclose your solution inside ```java```:
```
x,a,b=map(int,input().split())
print('A' if abs(x-a)<abs(x-b) else 'B')
```

### Input

The first line of input contains a single integer $T$ denoting the number of test cases.

The first line of each test case contains three space-separated integers $x$, $a$ and $b$ denoting the values of $x$, $a$ and $b$ respectively.

### Output

For each test case, print a single line containing the string 'A' if $x$ is closer to $a$ than to $b$ or 'B' otherwise.

### Constraints

$1 \leq T \leq 10^5$

$1 \leq x,a,b \leq 10^9$

### Sample Input

```
3
1 1 2
2 1 3
3 1 2
```

### Sample Output

```
A
B
A
```

### Explanation

In the first test case, $x=1$, $a=1$ and $b=2$.

Since $x-a=0$ and $x-b=1$, $x$ is closer to $a$ than to $b$.

In the second test case, $x=2$, $a=1$ and $b=3$.

Since $x-a=1$ and $x-b=2$, $x$ is closer to $b$ than to $a$.

In the third test case, $x=3$, $a=1$ and $b=2$.

Since $x-a=2$ and $x-b=1$, $x$ is closer to $a$ than to $b$.
</s>
