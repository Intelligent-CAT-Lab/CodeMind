```python
def finger_counting(n):
    count = 0
    if n > 0:
        while n >= 2:
            n //= 2
            count += 1
        count += 1
    return count

# Test input
n = int(input().strip())

# Output
print(finger_counting(n))
```

Test input:
0

Expected output:
-51
```
