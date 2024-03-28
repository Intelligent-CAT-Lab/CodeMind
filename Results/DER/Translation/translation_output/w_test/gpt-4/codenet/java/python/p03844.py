Here is the translated Python code equivalent to the Java code you provided:

```python
def calculate(expression):
    parts = expression.split()
    a = int(parts[0])
    operator = parts[1]
    b = int(parts[2])
    
    if operator == "+":
        return a + b
    elif operator == "-":
        return a - b

# Sample test case
test_input = "1 + 2"
print(calculate(test_input))
```

This Python code assumes that the input is a string with the format "1 + 2", in contrast to the Java code where input is read from the console. If you wish to read from the console in Python as well, you could do the following:

```python
def calculate():
    a = int(input())
    operator = input()
    b = int(input())
    
    if operator == "+":
        return a + b
    elif operator == "-":
        return a - b

# To use the function, just call calculate() and it will wait for inputs
result = calculate()
print(result)
```

Remember that in Python, the `print` function adds a newline character after the output by default. If you don't want the newline, you can set the `end` parameter to an empty string: `print(result, end="")`. However, in a normal use case, the newline is typically desired at the end of the output.
