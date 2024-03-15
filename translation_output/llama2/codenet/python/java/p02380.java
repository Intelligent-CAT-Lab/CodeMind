<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import math
a, b, c = map(int, input().split())
print(0.5*a*b*math.sin(math.radians(c)))
print(a+b+(a**2+b**2-2*a*b*math.cos(math.radians(c)))**0.5)
print(b*math.sin(math.radians(c)))

```

### Input

```
4 5 6
```

### Output

```
0.5
2.23606797749979
0.5
```

### Explanation

```
0.5*4*5*math.sin(math.radians(6))
2.23606797749979
4+5+(4**2+5**2-2*4*5*math.cos(math.radians(6)))**0.5
0.5
```

### Hint

- [math.radians](https://docs.python.org/3/library/math.html#math.radians)
- [math.sin](https://docs.python.org/3/library/math.html#math.sin)
- [math.cos](https://docs.python.org/3/library/math.html#math.cos)
- [math.sqrt](https://docs.python.org/3/library/math.html#math.sqrt)
- [math.pow](https://docs.python.org/3/library/math.html#math.pow)
- [map](https://docs.python.org/3/library/functions.html#map)
- [int](https://docs.python.org/3/library/functions.html#int)
- [split](https://docs.python.org/3/library/stdtypes.html#str.split)
- [input](https://docs.python.org/3/library/functions.html#input)
- [print](https://docs.python.org/3/library/functions.html#print)
</s>
