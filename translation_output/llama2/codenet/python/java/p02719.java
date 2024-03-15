<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n, k = map(int, input().split())

rot = n//k
x = n

if k == 1 or n == k or n%k == 0:
  x = 0
elif rot >= 1:
  x = n - k*rot
  
t = x%k

print(min(t, abs(t-k)))
```

### Input

The first line contains two integers, `n` and `k`.

### Output

Print the minimum number of rotations required to get the array sorted.

### Constraints

- `1 <= n <= 10^5`
- `1 <= k <= 10^5`

### Example

```
Input:
n = 10
k = 5

Output:
2
```

### Explanation

The array is `[1, 2, 3, 4, 5]`.

The first rotation is `[1, 2, 3, 4, 5] -> [5, 1, 2, 3, 4]`.

The second rotation is `[5, 1, 2, 3, 4] -> [4, 5, 1, 2, 3]`.

The array is sorted.

### Hint

- Use the modulo operator `%` to find the remainder of a division.
- Use the `//` operator to find the integer division of two numbers.
</s>
