Here is the translated code from Java to Python:

```python
# Read the input from the user
cmd = input()

# Split the input string into a list
x, y = map(int, cmd.split())

# Compare the values and print the result
if x == y:
    print("a == b")
if x < y:
    print("a < b")
if x > y:
    print("a > b")
```

To run a test case with the provided input ("1 2"), you can simply provide that input when prompted by the `input()` function. The expected output "a < b" will be printed.
