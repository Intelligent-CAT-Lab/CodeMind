<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from collections import Counter

S = list(input())
C = Counter(S)

o = []

for a in C.keys():
    j = 0
    m = 0
    for b in S:
        if a == b:
            j = 0
        else:
            j += 1
            m = max(m,j)
    o.append(m)

print(min(o))
```

### Input

- The first line contains an integer `N` denoting the number of test cases.
- The first line of each test case contains a string `S` denoting the string.

### Output

- For each test case, print the minimum number of operations required to make the string unique.

### Constraints

- `1 <= N <= 1000`
- `1 <= |S| <= 1000`
- `S` consists of lowercase English alphabets only.

### Example Input

```
3
abc
abc
abc
```

### Example Output

```
2
2
2
```

### Explanation

- In the first test case, the string is `abc`.
- The string can be made unique by replacing `a` with `b` and `b` with `c`.
- So, the minimum number of operations required to make the string unique is `2`.
- In the second test case, the string is `abc`.
- The string can be made unique by replacing `a` with `b` and `b` with `c`.
- So, the minimum number of operations required to make the string unique is `2`.
- In the third test case, the string is `abc`.
- The string can be made unique by replacing `a` with `b` and `b` with `c`.
- So, the minimum number of operations required to make the string unique is `2`.

### Hint

- Use `Counter` to count the number of occurrences of each character in the string.
- Use `min` to find the minimum number of operations required to make the string unique.
</s>
