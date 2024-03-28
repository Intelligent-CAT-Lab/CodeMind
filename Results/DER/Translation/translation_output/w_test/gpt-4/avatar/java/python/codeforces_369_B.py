Here is the translated Python code based on the Java code provided:

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

if __name__ == "__main__":
    input_data = input().split()
    n, k, l, r, sAll, sk = map(int, input_data)
    ans = get_points(n, k, l, r, sAll, sk)
    print(' '.join(map(str, ans)))

# Expected output for test case "1 1 1 1 1 1" is "1"
```

To use the code, simply run it and enter the test input to see the expected output.
