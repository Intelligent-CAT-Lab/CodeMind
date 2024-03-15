Here is the translated Python code for the given Java code:

```python
s = input()  # Read the input string
c = 0
for i in s:
    c += int(i)
if c % 9 == 0:
    print("Yes")
else:
    print("No")
```

In Python, you don't need to import a Scanner class to read input from the user; you can directly use the `input()` function. Also, when iterating over the string `s`, you can directly access each character without calling a `charAt` method as you would in Java. Finally, printing to the console is done with the `print()` function in Python.
