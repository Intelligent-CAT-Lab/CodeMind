Here's the translated code from Java to Python:

```python
A, B = map(int, input().split())
c = 0

for i in range(2):
    if A >= B:
        c += A
        A -= 1
    else:
        c += B
        B -= 1

print(c)
```

Given the test input "5 3", this Python code should output "9" as expected.
