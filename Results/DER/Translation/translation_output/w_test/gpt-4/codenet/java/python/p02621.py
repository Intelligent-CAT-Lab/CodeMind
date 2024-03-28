Here's the equivalent Python code for the Java code you provided:

```python
def calculate_expression(a):
    return a + (a * a) + (a * a * a)

# To mimic the test case:
test_input = int(input())  # Assuming this is where you input "2" for the test
print(calculate_expression(test_input))
```

In Python, we don't need to import a Scanner like in Java, as Python has built-in functions for getting input from the user. `input()` is used to read a string from standard input, and `int()` is used to convert it to an integer. The function `calculate_expression` performs the computation. If you were to run this code and input "2" when prompted, you would get the expected output "14".
