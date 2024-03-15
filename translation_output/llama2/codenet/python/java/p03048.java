<s> Translate the following python code to java and enclose your solution inside ```java```:
```
R, G, B, n = map(int, input().split())
cnt = 0
for r in range(n//R+1):
    for g in range((n-r*R)//G+1):
        b = (n-r*R-g*G)//B
        if r * R + g * G + b * B == n:
            cnt += 1

print(cnt)
```

### Input

The first line contains an integer `n` denoting the number of pixels in the image.

The second line contains four space-separated integers `R`, `G`, `B`, `n` denoting the number of rows, columns, and pixels in the image, respectively.

### Output

Print the number of ways to color the image.

### Constraints

`1 <= n <= 10^5`

`1 <= R, G, B <= 10^9`

### Example

```
Input:
3 3 3 3

Output:
1
```

### Explanation

The image is a 3x3 grid.

The only way to color the image is to color the first row with red, the second row with green, and the third row with blue.

### Hint

You can use the `java.lang.Math` class to compute the modulo of two integers.
</s>
