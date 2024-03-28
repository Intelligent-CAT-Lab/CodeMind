Here's the translated Python code from the provided Java code:

```python
# Read input from the user
n = int(input())

print(f"{n}:", end="")
i = 2
while n >= i * i:
    if n % i == 0:
        n = n // i
        print(f" {i}", end="")
    else:
        i += 1
print(f" {n}")
```

When running this Python code with the input `12`, the expected output will be `12: 2 2 3`.
