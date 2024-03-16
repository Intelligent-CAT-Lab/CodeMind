<s> Translate the following python code to java and enclose your solution inside ```java```:
```
# ABC067 A - Sharing Cookies
a,b = map(int,input().split())

if a%3 == 0:
    print('Possible')
elif b%3 == 0:
    print('Possible')
elif (a+b)%3 == 0:
    print('Possible')
else:
    print('Impossible')
```

### Input

The first line of input contains two integers, $a$ and $b$, separated by a space.

### Output

Print "Possible" if the cookies can be shared, or "Impossible" otherwise.

### Constraints

$1 \leq a,b \leq 10^9$

### Sample Input

```
1 2
```

### Sample Output

```
Possible
```

### Explanation

The cookies can be shared because $1+2 \equiv 3 \pmod{3}$.

### Hint

Use the modulo operator.
</s>
