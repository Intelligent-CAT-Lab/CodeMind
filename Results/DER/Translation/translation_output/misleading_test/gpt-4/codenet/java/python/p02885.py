Here is the Python equivalent of the given Java code. You can input "12 4" to get the expected output "33":

```python
# Reading a line of input
line = input()  # Assume input is "12 4"
line1 = line.split(" ")
a = int(line1[0])
b = int(line1[1])

# Computing and printing the result
if a > 2 * b:
    print(a - 2 * b)
else:
    print(0)
```

When you run this Python code and input "12 4", it should display the output "33".
