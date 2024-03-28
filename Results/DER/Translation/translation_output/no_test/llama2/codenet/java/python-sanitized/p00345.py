import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Irreducible Fractionalization
 */
def main():
    br = BufferedReader(InputStreamReader(System.in))
    line = br.readline()
    units = line.split("[()]")
    if len(units) == 2:
        bn = int(units[1])
        bd = 10 ** int(units[1]) - 1
    else:
        bn = 0
        bd = 1

    units = units[0].split(".")
    if len(units) == 2:
        bd *= 10 ** int(units[1])
        an = int(units[0] + units[1])
        ad = 10 ** int(units[1])
    else:
        an = int(units[0])

    n, d, g = 0, 0, 0
    d = lcm(ad, bd)
    n = an * (d / ad) + bn * d / bd
    g = gcd(n, d)
    n /= g
    d /= g

    print(n, d)

def lcm(a, b):
    if b == 0:
        return a
    return lcm(b, a % b)

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

if __name__ == "__main__":
    main()