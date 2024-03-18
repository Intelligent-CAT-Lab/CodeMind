import sys

MOD = 10 ** 9 + 7

def solve(M, D):
    ans = 0
    for m in range(1, M + 1):
        for d in range(1, D + 1):
            d1 = d % 10
            d2 = d // 10
            if d1 >= 2 and d2 >= 2 and d1 * d2 == m:
                ans += 1
    return ans

def main():
    M, D = map(int, input().split())
    result = solve(M, D)
    print(result)

if __name__ == '__main__':
    main()