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