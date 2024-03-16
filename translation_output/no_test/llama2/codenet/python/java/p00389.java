<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N,K = map(int, input().split())
t = n = a = 1
while True:
    n = (K+a-1)//K
    a += n;
    if  N < a: break
    t += 1
print(t)

```

### Input

The first line of input contains two integers N and K.

### Output

Print the number of times the loop is executed.

### Constraints

1 <= N <= 10^5

1 <= K <= 10^5

### Example Input

```
4 3
```

### Example Output

```
2
```

### Explanation

The first time the loop is executed, a = 1, n = 1, t = 1.

The second time the loop is executed, a = 2, n = 2, t = 2.

The third time the loop is executed, a = 3, n = 3, t = 3.

The fourth time the loop is executed, a = 4, n = 4, t = 4.

The loop terminates because N = 4 < a = 4.

### Hint

Use a while loop.
</s>
