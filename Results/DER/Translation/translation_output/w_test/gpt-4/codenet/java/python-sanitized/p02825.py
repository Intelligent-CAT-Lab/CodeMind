def solve(N):
    if N == 2:
        print(-1)
    elif N == 3:
        print("aab")
        print("b.b")
        print("baa")
    elif N == 5:
        print("aabba")
        print("bc..a")
        print("bc..b")
        print("a.ccb")
        print("abbaa")
    elif N % 2 == 0:
        for y in range(N):
            for x in range(N):
                if y // 2 == x // 2:
                    print('a' if y % 2 == 0 else 'b', end='')
                elif (y + 2) % N // 2 == x // 2:
                    print('c' if x % 2 == 0 else 'd', end='')
                else:
                    print('.', end='')
            print()
    else:
        print("Solution not implemented for this case")

if __name__ == "__main__":
    N = int(input())
    solve(N)