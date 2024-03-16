<s> Translate the following python code to java and enclose your solution inside ```java```:
```
K, A, B = [int(elem) for elem in input().split()]

if B - A <= 2:
    print(K + 1)
else:
    first_num_exchanges = A + 1
    rest_num_exchanges = K - first_num_exchanges
    gain_per_two_manipulation = B - A
    num_cookies = rest_num_exchanges // 2 * gain_per_two_manipulation + B
    if rest_num_exchanges % 2 == 1:
        num_cookies += 1
    print(num_cookies)

```

### Input

The first line of input contains three integers $K, A, B$ ($1 \leq K \leq 10^5, 1 \leq A, B \leq 10^9$).

### Output

Print a single integer, the number of cookies.

### Constraints

- $1 \leq K, A, B \leq 10^9$

### Sample Input

```
3 1000000000 1000000000
```

### Sample Output

```
1000000001
```

### Explanation

We can get $1000000001$ cookies by exchanging $1000000000$ cookies $1$ time and $1$ cookie $2$ times.

### Hint

- Use the `int` type to store the input.
- Use the `for` loop to iterate over the input.
- Use the `if` statement to check the condition.
- Use the `print` statement to output the result.
</s>
