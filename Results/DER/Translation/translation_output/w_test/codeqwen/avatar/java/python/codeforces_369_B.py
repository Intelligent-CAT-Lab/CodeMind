Here is the Python equivalent of the Java code:

```python
def get_points(n, k, l, r, s_all, sk):
    ans = [l] * n
    s_all -= sk + (n - k) * l
    sk -= k * l
    while sk > 0:
        idx = n - 1
        while sk > 0 and idx >= n - k:
            ans[idx] += 1
            sk -= 1
            idx -= 1
    while s_all > 0:
        idx = 0
        while s_all > 0 and idx < n - k:
            ans[idx] += 1
            s_all -= 1
            idx += 1
    return ans

def main():
    n, k, l, r, s_all, sk = map(int, input().split())
    ans = get_points(n, k, l, r, s_all, sk)
    print(' '.join(map(str, ans)))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the input from the user, calls the `get_points` function to calculate the points, and then prints the result. The `get_points` function is similar to the `getPoints` function in the Java code, but it uses Python's list comprehension and the `map` function to make the code more concise.
