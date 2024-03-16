<s> Translate the following python code to java and enclose your solution inside ```java```:
```
L, R = map(int, input().split())
if R - L > 2019:
  print(0)
else:
  l = []
  for i in range(L, R + 1):
    for j in range(i + 1, R + 1):
      l.append(i * j % 2019)
  print(min(l))
```

### Input

The first line contains two integers `L` and `R` (1 ≤ L ≤ R ≤ 1000000) separated by a space.

### Output

Print the minimum value of the list `l` in a single line.

### Constraints

- 1 ≤ L ≤ R ≤ 1000000
- 1 ≤ L ≤ R ≤ 1000000

### Sample Input

```
2 1000000
```

### Sample Output

```
1000000
```

### Explanation

The list `l` is `[1000000, 2000000, 3000000, 4000000, 5000000, 6000000, 7000000, 8000000, 9000000, 10000000]`.

The minimum value of the list `l` is `1000000`.
</s>
