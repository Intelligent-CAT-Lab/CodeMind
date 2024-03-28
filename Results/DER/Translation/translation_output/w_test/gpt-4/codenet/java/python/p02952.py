Here's the Python equivalent of the provided Java code:

```python
a = int(input())
c = 0
for i in range(1, a + 1):
    if len(str(i)) % 2 != 0:
        c += 1
print(c)
```

You can use this code with a test input as follows:

```python
# Test input
input_value = 11

# Test case
a = input_value
c = 0
for i in range(1, a + 1):
    if len(str(i)) % 2 != 0:
        c += 1
print(c)  # Expected output: 9
```
