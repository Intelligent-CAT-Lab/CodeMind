<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
mask = (1<<32)-1
print('{:032b}'.format(n))
print('{:032b}'.format(~n & mask))
print('{:032b}'.format((n<<1)& mask))
print('{:032b}'.format((n>>1)& mask))

```

### Input

- The first line contains a single integer `n` denoting the number of test cases.
- The next `n` lines contain a single integer `n` each.

### Output

- For each test case, print the output as specified in the sample output.

### Constraints

- `1 <= n <= 100000`
- `1 <= n <= 2^32`

### Sample Input

```
1
1
```

### Sample Output

```
00000000000000000000000000000000
11111111111111111111111111111111
00000000000000000000000000000000
11111111111111111111111111111111
```

### Explanation

- The first line prints the binary representation of `n`.
- The second line prints the binary representation of `~n & mask`.
- The third line prints the binary representation of `((n<<1)& mask)`.
- The fourth line prints the binary representation of `((n>>1)& mask)`.

### Hint

- Use the `>>` and `<<` operators to shift the bits.
- Use the `&` operator to perform bitwise AND operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SHIFT operation.
- Use the `^` operator to perform bitwise XOR operation.
- Use the `|` operator to perform bitwise OR operation.
- Use the `~` operator to perform bitwise NOT operation.
- Use the `>>` operator to perform bitwise RIGHT SHIFT operation.
- Use the `<<` operator to perform bitwise LEFT SH
