Here is the translated Python code:

```python
# Read integers from input
a, b, k = map(int, input().split())

# Create a set to hold the numbers
numbers_set = set()

# Add first 'k' numbers from 'a' to the set
for i in range(a, min(a + k, b + 1)):
    numbers_set.add(i)

# Add last 'k' numbers from 'b' to the set, without duplication
for i in range(b, max(b - k, a - 1), -1):
    numbers_set.add(i)

# Sort the set and print each element
for num in sorted(numbers_set):
    print(num)
```

You can run this code with the provided sample test case:

Test input:
```plaintext
3 8 2
```

Expected output:
```plaintext
3
4
7
8
```
