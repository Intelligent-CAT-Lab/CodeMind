<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n,m = map(int,input().split())

even = n * (n-1) // 2
odd = m * (m-1) // 2

print(even + odd)
```

### Input

The first line contains two integers `n` and `m` separated by a space.

### Output

Print the sum of `even` and `odd`.

### Constraints

- `1 <= n,m <= 100000`

### Sample Input

```
10 10
```

### Sample Output

```
100
```

### Explanation

`even = 10 * (10-1) // 2 = 50`

`odd = 10 * (10-1) // 2 = 50`

`50 + 50 = 100`
</s>
