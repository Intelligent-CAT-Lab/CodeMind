Here's the translated Python code:

```python
def digit_sum(num):
    r = 0
    while num > 0:
        r += num % 10
        num //= 10
    return r

def main():
    n = int(input())
    ans = n
    for a in range(2, n//2 + 1):
        b = n - a
        sum_of_digits = digit_sum(a) + digit_sum(b)
        ans = min(sum_of_digits, ans)
    print(ans)

if __name__ == "__main__":
    main()
```

Explanation:
- `Scanner` is replaced with `input()` for getting input from the user in Python.
- We use `//` for integer division in Python.
- The `digit` function is renamed to `digit_sum` and adjusted to Python's syntax. The concept stays the same: it calculates the sum of digits of a given number.
- The for loop syntax in Python does not include the initializing, condition, and increment expressions; instead, we use `range`.
- `Math.min` is replaced with the built-in `min()` function in Python.
- The `static` keyword is irrelevant in Python since all functions are accessible without it after they're defined.

Remember to run this Python script in an environment that allows input from the user, like a terminal or command-line interface.
