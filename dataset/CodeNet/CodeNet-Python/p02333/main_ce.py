import math
def combination(i: int, j: int) -> int:
    return math.factorial(i) // math.factorial(i - j) // math.factorial(j)
if __name__ == "__main__":
    n, k = map(lambda x: int(x), "4 3".split())
    modulo = 10 ** 9 + 7
    ans = 0
    if k <= n:
        for i in range(k):
            if 0 == i % 2:
                ans += (k - i) ** n * combination(k, i)
            else:
                ans -= (k - i) ** n * combination(k, i)
        ans = ans % modulo
    print(ans)
