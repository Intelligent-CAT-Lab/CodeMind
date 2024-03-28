class main:
    S = int(input())
    ans = 0
    for i in range(1, S + 1):
        if i % 3 == 0 or i % 5 == 0:
            continue
        else:
            ans = ans + i
    print(ans)