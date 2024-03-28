<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
print(1000-n%1000 if n%1000!=0 else 0)
```

### Input

The first line of input contains a single integer, `n`.

### Output

Print a single integer, `1000-n%1000 if n%1000!=0 else 0`.

### Constraints

- `1 <= n <= 10^9`

### Example Input

```
1000
```

### Example Output

```
0
```

### Explanation

The output is `0` because `1000-1000%1000` is `0`.
</s>
