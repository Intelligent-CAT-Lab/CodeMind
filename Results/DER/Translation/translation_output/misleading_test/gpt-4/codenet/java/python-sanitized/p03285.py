def can_be_formed(N):
    limit7 = N // 7
    check = False
    for i in range(limit7 + 1):
        left = N - (i * 7)
        if left % 4 == 0:
            check = True
            break
    return "Yes" if check else "No"

# Test input
N = int(input())

# Expected output
print(can_be_formed(N))