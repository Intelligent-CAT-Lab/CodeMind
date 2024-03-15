Here is the converted code from Java to Python:

```python
def get_points(n, k, l, r, sAll, sk):
    ans = [l] * n
    sAll -= sk + (n - k) * l
    sk -= k * l
    while sk > 0:
        idx = n - 1
        while sk > 0 and idx >= n - k:
            ans[idx] += 1
            idx -= 1
            sk -= 1

    while sAll > 0:
        idx = 0
        while sAll > 0 and idx < n - k:
            ans[idx] += 1
            idx += 1
            sAll -= 1

    return ans


def main():
    n, k, l, r, sAll, sk = map(int, input().split())
    ans = get_points(n, k, l, r, sAll, sk)
    print(' '.join(map(str, ans)))


if __name__ == "__main__":
    main()
```

I've transformed the code into Python by following these steps:
- Replacing array declaration and `Arrays.fill` with list comprehension and multiplication.
- Changing variable and function naming to follow Python conventions (snake_case).
- Adjusting print statements to use `join` and `map` to turn integer values into string and then concatenating them with spaces.
- Replacing `Scanner` with `input().split()` to read multiple integers on the same line in Python.
- Modifying the loop structure to match Python's syntax.
- Writing a `main` function that corresponds to the `public static void main` in Java.
