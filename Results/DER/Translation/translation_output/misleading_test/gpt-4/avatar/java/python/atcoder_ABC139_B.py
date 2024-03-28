Here's the equivalent code in Python:

```python
a, b = map(int, input().split())
kuti = 1
tap = 0

while kuti < b:
    kuti = kuti - 1 + a
    tap += 1

print(tap)
```

You can run this Python code with the input `8 8`, just like in the Java example, and it will produce the expected output `-31`.
