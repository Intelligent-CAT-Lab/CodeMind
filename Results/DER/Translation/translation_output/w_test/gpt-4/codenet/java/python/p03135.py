Here is the equivalent Python code for the Java code provided:

```python
# Get input from the user as a string and split it by space, converting each to an integer
T, X = map(int, input().split())

# Perform the division and store the result in variable 'a'
a = T / X

# Print the result with 10 decimal places
print(f"{a:.10f}")
```

You can use the above Python code to achieve the same result as the Java code. To match the specified formatting with 10 decimal places, I've used an f-string with a format specifier. If you run the Python code with the input "8 3", it will produce the expected output "2.6666666667".
