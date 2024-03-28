Sure, here is the equivalent Python code:

```python
import sys

try:
    # Reading input from stdin and splitting it into elements of a list
    # Note that in Python, we don't explicitly state that input is from stdin as it's the default behavior of `input()`.
    str_input = input().split()
    A = int(str_input[0])
    P = int(str_input[1])
    # The print statement automatically adds a newline at the end, unlike Java's System.out.println.
    print((P + 3 * A) // 2)

except IOError as e:
    # In Python, exceptions capture the actual error message by default.
    # Hence we can get the string representation of `e` to display it.
    print("Exception:", e)
```

I changed the variable name `str` to `str_input` since `str` is a built-in type in Python and it's best to avoid naming conflicts. In Python, the `print` function automatically adds a newline character, so we don't need to specify it as we do in Java with `println`. Moreover, I used integer division (`//`) because the context seems to require an integer result, just as it would in Java when dividing two integers.
