import sys

def solve(x):
    return x // 11 * 2 + x % 11 // 7 + min(x % 11, 1)

def main():
    x = int(sys.stdin.readline().strip())
    print(solve(x))

if __name__ == "__main__":
    main()