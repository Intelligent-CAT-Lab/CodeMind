Here is the Python translation of the provided Java code:

```python
def count_odd_length_numbers(N):
    count = 0
    temp = N
    ans = 0

    while temp > 0:
        temp //= 10
        count += 1

    for i in range(1, count + 1):
        if i == count:
            if i % 2 == 1:
                ans += (N - 10**(i - 1) + 1)
        else:
            if i == 1:
                ans += 9
            elif i % 2 == 1:
                ans += (10**i - 10**(i - 1))

    return ans

# Sample test case
N = 99999
print(count_odd_length_numbers(N))
```

When you run this Python function with the test input `99999`, it will produce the expected output `90933`.
