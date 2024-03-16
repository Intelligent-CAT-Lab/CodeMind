Here is the translated code from Java to Python. It reads two integers from a user (or standard input), and prints "Possible" if any of those integers or their sum is divisible by 3. Otherwise, it prints "Impossible".

```python
# Read integers from input
a, b = map(int, input().split())

# Check if a, b, or their sum is divisible by 3
if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
    print("Possible")
else:
    print("Impossible")
```

You can use the same test input provided (`4 5`) and you should get the expected output (`Possible`).
