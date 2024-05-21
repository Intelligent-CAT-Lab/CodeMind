import sys

def solve():
    a, b, c, x, y = map(int, input().split())
    ans = float('inf')
    for i in range(max(x, y) + 1):
        ans = min(ans, a * max(0, x - i) + b * max(0, y - i) + c * 2 * i)
    print(ans)

def main():
    solve()

if __name__ == '__main__':
    main()