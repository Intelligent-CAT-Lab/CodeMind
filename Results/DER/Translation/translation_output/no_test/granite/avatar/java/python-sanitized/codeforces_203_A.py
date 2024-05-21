import sys

def main():
    points, t, a, b, ta, tb = map(int, sys.stdin.readline().split())
    for i in range(t):
        for j in range(t):
            if points == 0 or points == a - i * ta or points == b - j * tb or points == a - i * ta + b - j * tb:
                print("YES")
                return
    print("NO")

if __name__ == "__main__":
    main()