def solve():
    A = int(input())
    B = int(input())
    if A > 9 or B > 9:
        print(-1)
        return
    print(A * B)

solve()