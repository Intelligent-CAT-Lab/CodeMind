import sys

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    if a - b == b - c:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()