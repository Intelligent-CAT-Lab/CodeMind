class p02879:
    def __init__(self):
        pass

    def solve(self):
        A, B = map(int, input().split())
        if A > 9 or B > 9:
            print(-1)
            return
        print(A * B)

if __name__ == "__main__":
    main = p02879()
    main.solve()