Below is the translated Python code from the provided Java example:

```python
import math

def run():
    # Input is expected to be provided in the format "a b c"
    # Where 'a', 'b' are sides of a triangle and 'c' is the angle in degrees between them.
    input_line = input().split(" ")
    a = float(input_line[0])
    b = float(input_line[1])
    cc = float(input_line[2])
    cc = math.radians(cc)

    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a**2 + b**2 - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    print(s)
    print(l)
    print(h)

# The run function is called to perform the computation and print the result.
# The input method in Python automatically reads from standard input (sys.stdin).
run()
```

Let's run the code with the provided sample test case:

Test input:
```
4 3 90
```

Expected output:
```
6.0
3.0
```

Remember to provide the input after executing the code.
