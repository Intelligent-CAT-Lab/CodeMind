import sys

def read_ints():
    return map(int, input().split())

def solve(x, y):
    ans = 0
    while x <= y:
        ans += 1
        x *= 2
    return ans

def main():
    x, y = read_ints()
    print(solve(x, y))

if __name__ == "__main__":
    main()