Here is the provided Java code translated into Python and sample input test case:

```python
def p03109(time):
    time = time[5:]
    if time[0] == '1' or int(time[1]) > 4:
        return "TBD"
    else:
        return "Heisei"

# Sample Test Case
test_input = "2019/04/30"
expected_output = p03109(test_input)
print(expected_output)
```

When you run the Python code with the provided test input, it will print the expected output corresponding to the Java program's logic.
