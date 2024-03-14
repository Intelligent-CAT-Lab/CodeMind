import sys

def main():
    n = int(sys.stdin.readline())
    if (n & (n - 1)) == 0:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()