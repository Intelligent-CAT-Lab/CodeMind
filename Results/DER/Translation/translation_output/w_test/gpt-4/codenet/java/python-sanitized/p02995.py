from math import gcd

class Compute:
    def least_common_multiple(self, a, b):
        return (a * b) // gcd(a, b)

def main():
    # Read the input
    A, B, C, D = map(int, input().split())

    n = B - A + 1

    if C == D:
        a = A // C
        b = B // C
        x = b - a
        if A % C == 0:
            x += 1
        answer = n - x
        print(answer)
        return

    a = A // C
    b = B // C
    p = b - a
    if A % C == 0:
        p += 1

    a = A // D
    b = B // D
    q = b - a
    if A % D == 0:
        q += 1

    compute = Compute()
    e = compute.least_common_multiple(C, D)
    a = A // e
    b = B // e
    r = b - a
    if A % e == 0:
        r += 1

    answer = n - (p + q - r)
    print(answer)

if __name__ == "__main__":
    main()