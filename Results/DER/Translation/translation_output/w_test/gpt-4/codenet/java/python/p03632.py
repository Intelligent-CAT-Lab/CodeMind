The following Python code is an equivalent translation of the java code you have provided. Python's `sys.stdin` from the `sys` module can be used to handle standard input. The `map` function in conjunction with a list comprehension can efficiently process and convert input strings into integer arrays, similar to Java's stream function.

Here's the translated code:

```python
import sys

def intersect_time_ranges(input_line):
    a, b, c, d = map(int, input_line.split())
    start = max(a, c)
    end = min(b, d)
    return max(0, end - start)

# Reading from standard input (stdin)
for line in sys.stdin:
    print(intersect_time_ranges(line.strip()))
```

Using your sample test case, you could run it manually like this (assuming the inputs are being piped into the program):

```shell
echo "0 75 25 100" | python translated_code.py
```

This should output `50` as expected. Note that this sample code directly processes each line of standard input as they are read.

Please be aware that this code, like the Java version, is designed for command-line usage and expects input to come from `stdin`, which is common in programming competition or problem-solving environments. If you're using this in a different context where you need to directly pass input as arguments or from another source, you'll have to modify the code accordingly.
