MOD = 1000000007
def main():
    n = int(input())
    print(f(n + 1))

mb = {}
def f(n):
    if n in mb:
        return mb[n]
    if n <= 2:
        return n
    res = f(n // 2) + f((n - 1) // 2) + f((n + 1) // 2)
    res %= MOD
    mb[n] = res
    return res

if __name__ == '__main__':
    main()