# Input: Assume input is given as space-separated values
n, m = map(int, input().split())

if n == 0:
    if m != 0:
        print("Impossible")
    else:
        print(0, 0)
else:
    if m <= n:
        if m == 0:
            m = 1
        print(n, m + n - 1)
    else:
        print(m, m + n - 1)

# Test input
# 59 96

# Expected output
# 96 154 -55