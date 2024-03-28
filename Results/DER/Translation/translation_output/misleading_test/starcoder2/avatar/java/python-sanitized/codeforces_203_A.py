import sys

def main():
    points, t, a, b, ta, tb = map(int, sys.stdin.readline().split())
    for i in range(t + 1):
        for j in range(t + 1):
            if points == a - i * ta + b - j * tb or (points == 0) or points == a - ta * i or points == b - tb * j:
                print("YES")
                return
    print("NO")

if __name__ == "__main__":
    main()