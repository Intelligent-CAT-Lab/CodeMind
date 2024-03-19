def solve(n, k):
    left = 1
    right = k + 1
    while right - left > 1:
        m = (left + right) // 2
        x = m
        total = 0
        for _ in range(n):
            if x > 0 and total <= k:
                total += x
                x //= 2
        if total <= k:
            left = m
        else:
            right = m
    return left

n, k = map(int, input().split())
print(solve(n, k))