Below is the translated version of the given Java code into Python:

```python
def count_divisible(a, b, x):
    count = b // x - a // x
    if a % x == 0:
        count += 1
    return count

# Sample test case
a, b, x = map(int, input().split())
print(count_divisible(a, b, x))
```

Now, if you run the above Python code with the input `'4 8 2'`, the expected output would indeed be `3`.
