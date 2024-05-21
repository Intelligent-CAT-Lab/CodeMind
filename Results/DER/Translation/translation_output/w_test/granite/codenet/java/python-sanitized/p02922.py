import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    ans = (b-1) // (a-1)
    if (b-1) % (a-1) == 0:
        print(ans)
    else:
        print(ans+1)

if __name__ == "__main__":
    main()