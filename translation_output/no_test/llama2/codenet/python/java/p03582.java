<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c = map(int,input().split())

L = [[0] for _ in range(a)] + [[1] for _ in range(b)] + [[2] for _ in range(c)]
while len(L) > 1:
  L[0] += L.pop()
  L.sort()
print(''.join(('a','b','c')[i] for i in L[0]))
```

### Input

The first line contains three integers $a,b,c$ ($1 \leq a,b,c \leq 10^5$)

### Output

Print the answer in a single line.

### Constraints

- $1 \leq a,b,c \leq 10^5$

### Sample Input

```
3 2 5
```

### Sample Output

```
abc
```

### Explanation

- The first line contains three integers $a,b,c$ ($1 \leq a,b,c \leq 10^5$)
- The second line contains the input string
- The third line contains the output string

### Hint

- Use the `split()` method to split the input string into a list of integers
- Use the `map()` method to convert the list of integers into a list of characters
- Use the `sort()` method to sort the list of characters
- Use the `join()` method to join the list of characters into a single string
</s>
