<s> Translate the following python code to java and enclose your solution inside ```java```:
```
h, a, b = map(int, input().split())
print([(h%(a+c)==0) for c in range(b-a+1)].count(True))

```

### Input

The first line contains an integer `h` (1 ≤ h ≤ 1000000).

The second line contains an integer `a` (1 ≤ a ≤ 1000000).

The third line contains an integer `b` (1 ≤ b ≤ 1000000).

### Output

Print the number of solutions modulo `h` that satisfy the equation `h%(a+c)==0` for `c` in the range `[a, b]`.

### Constraints

- 1 ≤ h ≤ 1000000
- 1 ≤ a ≤ 1000000
- 1 ≤ b ≤ 1000000

### Example

```
Input:
h = 1000000
a = 1000000
b = 1000000

Output:
1
```

### Hint

- Use the `map` function to convert the input to a list of integers.
- Use the `count` function to count the number of solutions.
</s>
