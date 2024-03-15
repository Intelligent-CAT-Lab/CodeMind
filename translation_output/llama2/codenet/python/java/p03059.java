<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, t = map(int, input().split())
print((t // a) * b)
```

### Input

The first line contains three integers `a`, `b`, and `t`.

### Output

Print the result of the division of `t` by `a` multiplied by `b`.

### Constraints

- `1 <= a, b <= 10^9`
- `1 <= t <= 10^9`

### Example

```
Input:
3 2 10

Output:
3
```

### Hint

- Use the `Scanner` class to read the input.
- Use the `System.out.print()` method to print the result.
- Use the `Math.floorDiv()` method to perform the division.
- Use the `Math.multiplyExact()` method to perform the multiplication.
</s>
