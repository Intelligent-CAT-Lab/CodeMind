import sys

def main():
    n = int(sys.stdin.readline())
    m = int(sys.stdin.readline())
    if((n + 1) // 2 >= m):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()