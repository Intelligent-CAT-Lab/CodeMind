Here is the Python version of the given Java code:

```python
def solve(a, b, c):
    if (c >= a and c <= b) or (c >= b and c <= a):
        print("Yes")
    else:
        print("No")

# Test input
a, b, c = map(int, input().split())

# Call the solve function with the input values
solve(a, b, c)
```

To mimic the behavior of the Java program completely, you would typically read inputs in Python by using `input()` for standard input, converting the input data to the appropriate type, and then passing it to the `solve()` function. The `print()` function in Python is used in place of the `OutputWriter` in Java.

Here is how you could run the code above with the test case provided:

```python
# Sample Test Case Input
input_data = "3 8 5"

# Feeding the input data to the program
a, b, c = map(int, input_data.split())
solve(a, b, c)
```

The expected output for this input will be:

```
Yes
```

As per the provided Java code, "Yes" will be printed on the same line, and if you want to replicate this behavior exactly in Python, avoid using the `newline` added by the `print()` function in Python by setting `end=''`, like so:

```python
print("Yes", end='') # This will make sure no newline character is printed after the text.
```
