Here is the translated Python code based on the provided Java example:

```python
def main():
    n, k = map(int, input().split())
    left = 1
    right = k + 1
    while right - left > 1:
        m = (left + right) // 2
        x = m
        total = 0
        for i in range(int(n)):
            if x <= 0 or total > k:
                break
            total += x
            x //= 2
        if total <= k:
            left = m
        else:
            right = m
    print(left)

if __name__ == "__main__":
    main()
```

Please note a few key differences that were taken into account while translating:

1. In Python, we use the `input()` function to capture user input instead of a `Scanner` object and unpack it into multiple variables using `map`.

2. Integer division is performed with `//` in Python instead of `/`, as the latter would result in float division.

3. Python does not have type-specific declarations for variables and does not use semicolons at the end of statements, unlike Java.

4. The `print` function is used in Python to output results rather than `System.out.println`.

5. The `for` loop construct in Python does not use initialization, condition, and increment statements; it works by iterating over a sequence or a range of numbers, so the code was adjusted accordingly for the `for` loop.
