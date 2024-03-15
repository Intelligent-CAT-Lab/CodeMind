<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())

result = []
for i in range(1, int(n**(1/2)+1)):
    if n%i==0:
        result.append(max(len(str(i)), len(str(n//i))))
print(min(result))
```

### Input

The first line contains a single integer `n` denoting the number of test cases.

The next `n` lines contain a single integer `n` denoting the number of test cases.

### Output

For each test case, print a single integer denoting the minimum length of the string representation of the number.

### Constraints

1 <= n <= 100000

### Example Input

```
3
10
100
1000
```

### Example Output

```
3
4
5
```

### Explanation

The first test case is `10`.

The number `10` can be represented as `10` or `100`.

The minimum length of the string representation of the number is `3`.

The second test case is `100`.

The number `100` can be represented as `100` or `1000`.

The minimum length of the string representation of the number is `4`.

The third test case is `1000`.

The number `1000` can be represented as `1000` or `10000`.

The minimum length of the string representation of the number is `5`.
</s>
