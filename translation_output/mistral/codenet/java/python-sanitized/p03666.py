import sys

class p03666:
    def solve(self):
        N = int(input())
        A = long(input())
        B = long(input())
        C = long(input())
        D = long(input())
        for i in range(N):
            max = D * (N - 1 - i) - C * i
            min = C * (N - 1 - i) - D * i
            if abs(B - A) >= min and abs(B - A) <= max:
                print("YES")
                return
        print("NO")

if __name__ == "__main__":
    p03666().solve()