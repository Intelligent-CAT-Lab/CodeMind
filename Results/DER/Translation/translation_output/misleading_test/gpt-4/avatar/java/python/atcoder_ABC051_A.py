Here's the Python code that achieves the same functionality as the given Java code:

```python
test_input = "pnxnn,muduhzn,aquud,"

input_parts = test_input.strip(',').split(',')

a = input_parts[0].replace('p', '@').replace('m', ' ')
b = input_parts[1].replace('u', 's').replace('n', ' ')
c = input_parts[2].replace('a', ' ').replace('d', 'f')

print(a, b, c)
```

You can run this snippet with the provided test input to get the expected output. However, please note that in a real Python script, you'd typically want to read the input from the user using `input()`. The above snippet assumes that the input is pre-defined as a string in the variable `test_input`.
