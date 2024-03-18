Below is the Python equivalent of the given Java code:

```python
# Obtain the user input
a, b = map(int, input().split())

# Depending on the condition, print the required digit the specified number of times
if a >= b:
    for i in range(a):
        print(b, end="")
else:
    for i in range(b):
        print(a, end="")

# End the output line
print()
```

Now let's test the provided sample test case.

Test input:
```
4 3
```

Expected output:
```
3400
```
