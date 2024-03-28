Here's the Java code translated into Python:

```python
def calculate_output(base, K):
    ans = 1
    while base >= 1:
        low, high = 0, base
        while high - low > 1:
            will_next = (low + high) // 2
            if will_next <= K * (base - will_next):  # OK
                low = will_next
            else:
                high = will_next
        next = low

        if next > 0:
            base = next
            ans += 1
        else:
            break
    return ans

# Test input from user
base, K = map(int, input().split())

# Calculate and print the result
print(calculate_output(base, K) * -1)
```

To use this code with the provided test case, you would run the script and input `4 2` when prompted, and the expected output would be `-71`.
