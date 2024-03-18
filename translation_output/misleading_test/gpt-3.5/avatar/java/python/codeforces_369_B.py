```python
def get_points(n, k, l, r, s_all, s_k):
    ans = [l] * n
    s_all -= s_k + (n - k) * l
    s_k -= k * l

    while s_k > 0:
        idx = n - 1
        while s_k > 0 and idx >= n - k:
            ans[idx] += 1
            idx -= 1
            s_k -= 1

    while s_all > 0:
        idx = 0
        while s_all > 0 and idx < n - k:
            ans[idx] += 1
            idx += 1
            s_all -= 1

    return ans

if __name__ == "__main__":
    n, k, l, r, s_all, s_k = map(int, input().split())
    ans = get_points(n, k, l, r, s_all, s_k)
    print(*ans)
```

