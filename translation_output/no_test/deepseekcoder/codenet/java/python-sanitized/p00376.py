import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())

    ans = abs(a - b)

    print(ans)

if __name__ == "__main__":
    main()