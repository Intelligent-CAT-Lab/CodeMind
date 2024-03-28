class main:
    n, k = map(int, input().split())
    left, right = 1, k + 1
    while right - left > 1:
        m = (left + right) // 2
        x = m
        total = 0
        for i in range(n):
            if x > 0 and total <= k:
                total += x
                x //= 2
            else:
                break
        if total <= k:
            left = m
        else:
            right = m
    print(left)