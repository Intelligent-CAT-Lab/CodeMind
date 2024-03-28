import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if ((a + 1) // 2) >= b:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()