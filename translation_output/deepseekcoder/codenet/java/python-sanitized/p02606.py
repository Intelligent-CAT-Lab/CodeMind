import sys

class p02606:

    def __init__(self):
        L = int(sys.stdin.readline().strip())
        R = int(sys.stdin.readline().strip())
        d = int(sys.stdin.readline().strip())

        Ans = 0
        for i in range(L, R+1):
            if i % d == 0:
                Ans += 1

        print(Ans)

if __name__ == "__main__":
    p02606()