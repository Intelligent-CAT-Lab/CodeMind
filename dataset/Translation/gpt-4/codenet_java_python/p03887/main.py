import sys
from math import comb
MOD = 10**9 + 7

def solve(n, a, b, c):
    if b % 2 == 1:
        return 0

    answer = 0
    for x in range(a, -1, -1):
        group1 = x
        restA = a - x
        group2 = restA
        restC1 = c - restA
        if restC1 < 0:
            break

        if b > 0:
            for y in range(restC1 // 3 + 1):
                group3 = y
                restC2 = restC1 - 3 * y
                group4 = b // 2

                count = comb(b // 2 + restC2 - 1, b // 2 - 1)
                count *= comb(group1 + group2 + group3 + group4, group4)
                count *= comb(group1 + group2 + group3, group3)
                count *= comb(group1 + group2, group2)
                answer = (answer + count) % MOD
        elif restC1 % 3 == 0:
            group3 = restC1 // 3
            count = comb(group1 + group2 + group3, group3)
            count *= comb(group1 + group2, group2)
            answer = (answer + count) % MOD

    return answer

def read_input():
    return map(int, input().split())

def main():
    n, a, b, c = read_input()
    print(solve(n, a, b, c))

if __name__ == '__main__':
    main()