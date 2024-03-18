def divisor_game(n):
    pf = {}
    i = 2
    while i * i <= n:
        c = 0
        while n % i == 0:
            n //= i
            c += 1
        if c > 0:
            pf[i] = c
        i += 1

    if n > 1:
        pf[n] = 1

    ans = 1
    for value in pf.values():
        ans *= (value + 1)

    return f"{len(pf)} {ans - 1}"

def main():
    n = int(input())
    result = divisor_game(n)
    print(result)

if __name__ == '__main__':
    main()