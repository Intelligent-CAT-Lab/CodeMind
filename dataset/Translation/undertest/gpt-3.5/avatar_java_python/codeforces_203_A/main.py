import sys

class ATwoProblems:
    def solve(self, points, t, a, b, ta, tb):
        for i in range(t):
            for j in range(t):
                if points == a - i * ta + b - j * tb or points == 0 or points == a - ta * i or points == b - tb * j:
                    print("YES")
                    return
        print("NO")

def main():
    points, t, a, b, ta, tb = map(int, input().split())
    solver = ATwoProblems()
    solver.solve(points, t, a, b, ta, tb)

if __name__ == "__main__":
    main()