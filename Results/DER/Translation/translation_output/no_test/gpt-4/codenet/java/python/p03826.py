Here's the equivalent Python code for the Java code you provided:

```python
# Assuming Python 3 because Python 2 is no longer supported

# Read input from the user
a = int(input()) * int(input())
b = int(input()) * int(input())

# Print the maximum of a and b
print(max(a, b))
```

In Python, the `input()` function is used to get input from the user, and it reads data from the console as a string. Thus, we cast it to `int` to get integer values. There is no need to explicitly close the input in Python, as there is no Scanner object to dispose of. The `max()` function is used to get the maximum of the two values and print it.
