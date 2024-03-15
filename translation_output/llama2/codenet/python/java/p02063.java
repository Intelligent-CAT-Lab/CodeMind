<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A,B = map(int,input().split())

if B%A == 0:
    print(-1)
    exit()

_k = -(-B//A)

for k in range(_k, _k+10**7):
    bn, rem = divmod(k*A, B)
    an, rem = divmod(rem, A)
    n = bn + an + rem
    if n > k:
        print(k*A)
        exit()
print(-1)

```

### Input

The first line of input contains two integers $A$ and $B$ ($1 \leq A, B \leq 10^9$).

### Output

Print the number of integers $k$ such that $k*A$ is a multiple of $B$.

### Constraints

- $1 \leq A, B \leq 10^9$

### Sample Input

```
2 3
```

### Sample Output

```
2
```

### Explanation

The only multiple of $2$ that is a multiple of $3$ is $2$.

### Hint

- Use the modulo operator `%` to check if a number is a multiple of another.
- Use the `divmod` function to divide two numbers and get the remainder.
- Use the `range` function to iterate over a range of numbers.
- Use the `exit` function to exit the program.
</s>
