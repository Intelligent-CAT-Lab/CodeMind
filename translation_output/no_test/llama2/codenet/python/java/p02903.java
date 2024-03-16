<s> Translate the following python code to java and enclose your solution inside ```java```:
```
h,w,a,b = map(int,input().split())
for i in range(h):
    if i < b:
        print("".join(["0"]*a+["1"]*(w-a)))
    else:
        print("".join(["1"]*a+["0"]*(w-a)))

```

### Input

The first line of input contains four integers $h,w,a,b$ ($1 \leq h,w,a,b \leq 10^5$) denoting the height, width, and the number of 1s and 0s in the binary string, respectively.

### Output

Print the binary string.

### Constraints

- $1 \leq h,w,a,b \leq 10^5$

### Sample Input

```
4 5 2 3
```

### Sample Output

```
0011
```

### Explanation

The binary string is $0011$.

### Hint

- Use the `String` class to represent the binary string.
- Use the `for` loop to iterate over the rows.
- Use the `if` statement to check the condition.
- Use the `print` statement to print the binary string.
</s>
