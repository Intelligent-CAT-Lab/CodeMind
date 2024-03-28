import sys

def solve(points, t, a, b, ta, tb):
    for i in range(t):
        for j in range(t):
            if points == a - i * ta + b - j * tb or points == 0 or points == a - ta * i or points == b - tb * j:
                print("YES")
                return
    print("NO")

if __name__ == "__main__":
    points, t, a, b, ta, tb = map(int, sys.stdin.readline().split())
    solve(points, t, a, b, ta, tb)