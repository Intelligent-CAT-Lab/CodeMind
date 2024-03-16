def p03963():
    N = int(input())
    K = int(input())
    ans = K
    for i in range(2, N + 1):
        ans *= (K - 1)
    print(ans)

p03963()