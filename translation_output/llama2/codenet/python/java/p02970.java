<s> Translate the following python code to java and enclose your solution inside ```java```:
```
def solve():
    n, d = map(int, input().split())
    print(-(-n//(2*d+1)))


if __name__ == '__main__':
    solve()

```

### Input

The first line of input contains two integers, $n$ and $d$.

### Output

Print the output of the function.

### Constraints

$1 \leq n \leq 10^5$

$1 \leq d \leq 10^5$

### Sample Input

```
4 3
```

### Sample Output

```
-1
```

### Explanation

The output of the function is $-(-4//(2*3+1)) = -(-4//4) = -1$.
</s>
