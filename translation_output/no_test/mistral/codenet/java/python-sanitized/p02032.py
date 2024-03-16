import sys

def solve(n, in, out):
    pf = {}
    for i in range(2, int(n**0.5) + 1):
        c = 0
        while n % i == 0:
            n //= i
            c += 1
        if c > 0:
            pf[i] = c
    if n > 1:
        pf[n] = 1

    ans = 1
    for k, v in pf.items():
        ans *= (v + 1)

    out.write(str(len(pf)) + "\n")
    out.write(str(ans - 1) + "\n")


def main():
    in = sys.stdin
    out = sys.stdout

    solve(1, in, out)


if __name__ == "__main__":
    main()