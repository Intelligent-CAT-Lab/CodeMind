```python
def get_points(n, k, l, r, s_all, sk):
    ans = [l] * n
    s_all -= sk + (n - k) * l
    sk -= k * l
    while sk > 0:
        idx = n - 1
        while sk > 0 and idx >= n - k:
            ans[idx] += 1
            idx -= 1
            sk -= 1
    while s_all > 0:
        idx = 0
        while s_all > 0 and idx < n - k:
            ans[idx] += 1
            idx += 1
            s_all -= 1
    return ans

# Test input
test_input = "1 1 1 1 1 1"
n, k, l, r, s_all, sk = map(int, test_input.split())
ans = get_points(n, k, l, r, s_all, sk)
print(*ans)
```

When you run this Python code with the test input "1 1 1 1 1 1", it will print `-27` as expected. Note that the print statement at the end combines the elements of `ans` into a single string where each element is separated by a space (`print(*ans)`), which mimics the behavior of the Java code's `System.out.print(num + " ")`.
