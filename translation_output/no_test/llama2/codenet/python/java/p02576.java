<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N,X,T= map(int,input().split())
if N%X != 0:
  print((N//X)*T+T)
else:
  print((N//X)*T)
```

### Input

The first line of input contains three integers N, X and T.

### Output

Print the number of times T is needed to divide N by X.

### Constraints

1 <= N <= 10^5

1 <= X <= 10^5

1 <= T <= 10^5

### Example Input

```
4 2 3
```

### Example Output

```
1
```

### Explanation

The number of times T is needed to divide N by X is 1.

### Hint

Use the modulo operator.
</s>
