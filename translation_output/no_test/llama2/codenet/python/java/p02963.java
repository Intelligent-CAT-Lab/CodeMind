<s> Translate the following python code to java and enclose your solution inside ```java```:
```
S = int(input())

X1 = 0
Y1 = 0

tmp = int(S**0.5)
if tmp**2 >= S:
    X2 = Y3 = tmp
else:
    X2 = Y3 = tmp+1

rest = X2**2 - S

if rest == 0:
    X3 = Y2 = 0
else:
    if rest < 10**9:
        X3 = 1
        Y2 = rest
    else:
        for i in range(2, int(rest**0.5)+2):
            if rest % i == 0:
                X3 = i
                Y2 = rest // i

print(X1, Y1, X2, Y2, X3, Y3)
```

### Input

The first line contains a single integer `S` denoting the number of test cases.

The next `S` lines contain a single integer `S` each.

### Output

For each test case, print the following `6` integers on a new line:

- `X1`
- `Y1`
- `X2`
- `Y2`
- `X3`
- `Y3`

### Constraints

- `1 <= S <= 100000`
- `1 <= S <= 100000`
- `1 <= X1, Y1, X2, Y2, X3, Y3 <= 100000`

### Example

```
Input:

3
100000
100000
100000

Output:

0 0 1 1 1 1
0 0 1 1 1 1
0 0 1 1 1 1

Explanation:

For the first test case, the value of `S` is `100000`.

The value of `S` is `100000`.

The value of `S` is `100000`.

```
</s>
