Here is the Python equivalent of the provided Java code:

```python
# No need to import a scanner in Python, we can use input() function

# Read from input, splitting by space and converting parts to integers
a, b = map(int, input().split())

if a <= 5:
    print(0)
elif a <= 12:
    print(b // 2)
else:
    print(b)
```

For the provided test case (30 100), you can test the Python code like this:
```python
# Simulate input by setting the values directly
a, b = 30, 100

if a <= 5:
    print(0)
elif a <= 12:
    print(b // 2)
else:
    print(b)
# Expected output: 100
```
