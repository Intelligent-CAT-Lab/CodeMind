The following code is a Python version of the provided Java code:

```python
def calculate_steps(base, K):
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

# Test the function
base, K = map(int, input().split())
result = calculate_steps(base, K)
print(result)
```

You can simply paste this code into your Python environment and use the provided test input (`4 2`) to check its output, which should match the expected output (`3`).
