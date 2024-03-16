from math import gcd

def lcm(a, b):
    return a * (b // gcd(a, b))

def main():
    an, ad = 0, 1  # Non-repeating part numerator and denominator
    bn, bd = 0, 1  # Repeating part numerator and denominator

    # Read the input
    line = input()

    # Process the repeating part (if present)
    units = line.split('(')
    if len(units) > 1:
        repeating = units[1].replace(')', '')
        bn = int(repeating)
        bd = 10**len(repeating) - 1

    # Process the non-repeating part
    units = units[0].split(".")
    if len(units) == 2:
        bd *= 10**len(units[1])
        an = int(units[0] + units[1])
        ad = 10**len(units[1])
    else:
        an = int(units[0])

    # Compute the irreducible fraction
    d = lcm(ad, bd)
    n = an * (d // ad) + bn * (d // bd)
    g = gcd(n, d)
    n //= g
    d //= g

    print(f"{n}/{d}")

if __name__ == "__main__":
    main()