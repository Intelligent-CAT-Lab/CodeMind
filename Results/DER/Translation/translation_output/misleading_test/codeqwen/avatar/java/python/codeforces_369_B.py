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

This Python code does the same thing as the Java code. It reads the input from the user, calls the `get_points` function to calculate the points, and then prints the result. The `get_points` function works similarly to the `getPoints` method in the Java code. It initializes an array `ans` with `l` as the value for all elements, then subtracts `sk` and `(n - k) * l` from `s_all` and `sk` respectively. Then it uses two while loops to increment the elements of `ans` from the end and from the beginning, respectively. Finally, it returns the `ans` array. The `main` function reads the input from the user, calls the `get_points` function, and then prints the result.
