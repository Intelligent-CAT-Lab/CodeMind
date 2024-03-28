def p02606():
    L, R, d = map(int, input().split())

    Ans = 0
    for i in range(L, R+1):
        if i % d == 0:
            Ans += 1

    print(Ans)

p02606()