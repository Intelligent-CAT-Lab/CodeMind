<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import math
x1, y1, x2, y2 = map(lambda x: float(x), input().split(" "))
print("{:f}".format(math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)))


```

### Input

```
1 2 3 4
```

### Output

```
5.0
```

### Explanation

```
x1 = 1
y1 = 2
x2 = 3
y2 = 4

math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2) = math.sqrt((1 - 3) ** 2 + (2 - 4) ** 2) = math.sqrt(16 + 16) = math.sqrt(32) = 5.0
```

### Hint

- [math.sqrt()](https://docs.python.org/3/library/math.html#math.sqrt)
- [map()](https://docs.python.org/3/library/functions.html#map)
- [lambda()](https://docs.python.org/3/reference/expressions.html#lambda)
- [float()](https://docs.python.org/3/library/functions.html#float)
- [input()](https://docs.python.org/3/library/functions.html#input)
- [split()](https://docs.python.org/3/library/stdtypes.html#str.split)
- [format()](https://docs.python.org/3/library/string.html#format-string-syntax)
</s>
