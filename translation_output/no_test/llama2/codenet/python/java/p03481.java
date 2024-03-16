<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import math

n = list(map(int,input().split()))
X = n[0]
Y = n[1]

k = (Y//X).bit_length()
print(k)
```

### Input

```
4 5
```

### Output

```
2
```

### Explanation

The input is 4 5.

The output is 2.

### Hint

- Use the `bit_length` method of the `int` class.
- Use the `//` operator to divide two integers.
- Use the `map` function to convert a list of strings to a list of integers.
- Use the `split` function to split a string into a list of strings.
</s>
