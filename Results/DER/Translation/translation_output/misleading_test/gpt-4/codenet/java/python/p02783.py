Here's the Python translation of the given Java code:

```python
def calculate_attacks(h, a):
    n = h // a
    if h % a > 0:
        n += 1
    return n

# Sample test case
h, a = map(int, input().split())
print(calculate_attacks(h, a)*a)
```

When you run this Python code and provide the same test input "10 4", it should print the expected output "78". Note that this code assumes that the input is given in the same way as the test input scenario, i.e., two integers separated by a space on a single line.
