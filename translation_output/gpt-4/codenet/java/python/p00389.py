Here's the equivalent Python code for the Java code you've provided:

```python
base, K = map(int, input().split())
next_val = 0
ans = 1
while base >= 1:
    low, high = 0, base
    while high - low > 1:
        will_next = (low + high) // 2
        if will_next <= K * (base - will_next):  # OK
            low = will_next
        else:
            high = will_next
    next_val = low

    if next_val > 0:
        base = next_val
        ans += 1
    else:
        break
print(ans)
```

In this code, I switched from using a Scanner for input to using `input().split()` in line 1 for taking the input. The `map(int, ...)` function is used to convert the input strings to integers. Integer division is performed using `//` in Python. Variables can be declared and assigned without specifying their type. The `print` function is used to output the result instead of `System.out.println`.
