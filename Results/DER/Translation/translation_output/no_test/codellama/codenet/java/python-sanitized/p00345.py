import math

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return a * (b / gcd(a, b))

def main():
    line = input("Enter a fraction: ")
    units = line.split("[()]")

    an = 0
    ad = 1
    bn = 0
    bd = 1

    if len(units) == 2:
        bn = int(units[1])
        bd = (10 ** len(units[1])) - 1

    units = units[0].split(".")

    if len(units) == 2:
        bd *= (10 ** len(units[1]))
        an = int(units[0] + units[1])
        ad = (10 ** len(units[1]))
    else:
        an = int(units[0])

    n = an * (lcm(ad, bd) // ad) + bn * lcm(ad, bd) // bd
    d = lcm(ad, bd)
    g = gcd(n, d)
    n //= g
    d //= g

    print(f"{n}/{d}")

if __name__ == "__main__":
    main()