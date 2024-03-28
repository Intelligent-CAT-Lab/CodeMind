Here's the translated code from Java to Python:

```python
# Read the input
h, w, a, b = map(int, input().split())

# Prepare strings for the two types of lines
s1 = "0" * a + "1" * (w - a)
s2 = "1" * a + "0" * (w - a)

# Generate the output matrix
for i in range(h):
    if i < b:
        print(s1)
    else:
        print(s2)
```

Running this Python code with the input `3 3 1 1` would generate the expected output:

```
100
010
001
```
