import sys

def solve():
    a, b, c, x, y = map(int, input().split())

    min_cost = float('inf')
    for i in range(max(x, y) + 1):
        tmp = a * max(0, x - i) + b * max(0, y - i) + c * 2 * i
        min_cost = min(min_cost, tmp)

    print(min_cost)

if __name__ == "__main__":
    solve()