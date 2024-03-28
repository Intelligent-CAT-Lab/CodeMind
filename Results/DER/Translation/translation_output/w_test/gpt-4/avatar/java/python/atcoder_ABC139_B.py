Here is the translated code in Python:

```python
a, b = map(int, input().split())
kuti = 1
tap = 0

while kuti < b:
    kuti = kuti - 1 + a
    tap += 1

print(tap)
```

To test the code with the given test input (8 8), you can run the Python program and provide "8 8" without quotes as standard input, and it should produce the expected output (1).
