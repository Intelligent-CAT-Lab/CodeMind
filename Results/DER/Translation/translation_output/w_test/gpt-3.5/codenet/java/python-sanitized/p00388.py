def design_of_a_mansion():
    H, A, B = map(int, input().split())
    ans = 0

    for i in range(A, B + 1):
        if H % i == 0:
            ans += 1

    print(ans)

# Test case
design_of_a_mansion()