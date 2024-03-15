Here is the equivalent Python code for the Java code you provided:

```python
# No need to import anything for basic input/output in Python

def count_odd_length_numbers(n):
    count = 0
    for i in range(1, n + 1):
        if len(str(i)) % 2 != 0:
            count += 1
    return count

# In Python, the standard input can be taken with input() function
a = int(input())

# Call the function we defined above and print the result
c = count_odd_length_numbers(a)
print(c)
```

This code defines a function `count_odd_length_numbers` which counts numbers with an odd number of digits up to `n`. It then takes an integer input from the user, calls the function with the input value, and prints the result. Note that Python does not need to declare types for `a, b, c`, and there's also no need to import a scanner for input like in Java since Python's `input()` function does the job.
