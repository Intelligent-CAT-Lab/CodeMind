import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    ans = A * B
    print(ans)

if __name__ == "__main__":
    main()