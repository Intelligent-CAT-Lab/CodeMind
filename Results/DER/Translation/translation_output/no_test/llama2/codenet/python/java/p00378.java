<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A, B, X = map(int, input().split())
k = (X // 1000)
ans = k * min(A, 2*B)
r = X - 1000*k
if 0 < r <= 500:
    ans += min(A, B)
elif 500 < r:
    ans += min(A, 2*B)
print(ans)

```

### Input

The first line contains an integer T, the number of test cases.

Each test case contains three integers A, B, X.

### Output

For each test case, print the answer to the problem.

### Constraints

1 <= T <= 100

1 <= A, B <= 100000

1 <= X <= 100000

### Example

```
Input:
3
1000 1000 1000
1000 1000 1000
1000 1000 1000

Output:
1000
1000
1000

Explanation:

Case 1:

A = 1000
B = 1000
X = 1000

k = (X // 1000) = 1

ans = k * min(A, 2*B) = 1 * min(1000, 2*1000) = 1000

r = X - 1000*k = 0

if 0 < r <= 500:
    ans += min(A, B) = 1000 + min(1000, 1000) = 1000

Case 2:

A = 1000
B = 1000
X = 1000

k = (X // 1000) = 1

ans = k * min(A, 2*B) = 1 * min(1000, 2*1000) = 1000

r = X - 1000*k = 0

if 0 < r <= 500:
    ans += min(A, B) = 1000 + min(1000, 1000) = 1000

Case 3:

A = 1000
B = 1000
X = 1000

k = (X // 1000) = 1

ans = k * min(A, 2*B) = 1 * min(1000, 2*1000) = 1000

r = X - 1000*k = 0

if 0 < r <= 500:
    ans += min(A, B) = 1000 + min(1000, 1000) = 1000
```

### Hint

- Use the `int` data type to store integers.
- Use the `map` function to convert a list of strings to a list of integers.
- Use the `min` function to find the minimum of two integers.
- Use the `//` operator to perform integer division.
- Use the `*` operator to perform integer multiplication.
- Use the `if` statement to perform conditional execution.
- Use the `<=`, `>=` and `==` operators to perform comparisons.
- Use the `print` statement to output text to the console.
</s>
