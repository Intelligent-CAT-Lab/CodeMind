Below is the translated Java code into Python:

```python
import sys

# Read the number from stdin
n = int(input().rstrip())

# Create a list of boolean values
arr = [False] * (n + 3)
arr[0] = True
arr[1] = True

count = 0
# Sieve of Eratosthenes
for i in range(2, len(arr)):
    if not arr[i]:
        for j in range(2, n//i + 1):
            arr[i * j] = True
        # Check for prime pairs
        if not arr[i] and not arr[i - 2]:
            count += 1

# Print the result
print(count * 2)
```

Please note that Python directly reads from standard input and does not require importing a Scanner-like class as in Java. Additionally, Python uses indentation rather than braces ({}) for defining the scope of loops and conditions. The `input().rstrip()` is used to read a string from the standard input and removes any trailing whitespaces or newline characters, emulating the `nextInt()` behavior of Java's `Scanner`. Also, in Python, list indexing starts at 0, just like in Java. The `range` function is used for creating sequences of numbers for iteration, where `range(start, stop)` generates numbers from `start` to `stop - 1`.
