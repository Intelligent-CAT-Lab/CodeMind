Here's the equivalent Python code for the given Java code:

```python
# No import needed for basic input in Python

N = int(input())  # Directly reading the integer input

for i in range(N + 1):  # In Python loop range goes from 0 to N inclusive
    if int(i * 1.08) == N:
        print(i)
        break  # Using break to exit the loop instead of return
else:
    # The else block on a loop in Python is executed if the loop is not terminated by a break statement
    print(":(")
```

Note that in Python, there's no need to import a specific class for basic console input and output operations. The `input()` function reads a string from the standard input, and it's common to chain it with type conversion like `int(input())` to read numbers. Additionally, Python uses indentation to define code blocks instead of braces.
