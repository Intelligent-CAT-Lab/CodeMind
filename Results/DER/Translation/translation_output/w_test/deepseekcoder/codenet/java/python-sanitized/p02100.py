import re
import sys

def factorize(poly):
    factors = [0]*6
    coeff, var = 1, 0
    for term in re.findall(r'[+-]?[^-+]+', poly):
        if 'x' in term:
            coeff = int(term.split('x')[0] or 1)
            var = int(term.split('^')[-1] or 1)
        else:
            factors[0] += coeff * int(term)
    factors[var] = coeff
    return factors

def solve(factors):
    for x in range(1, abs(factors[0])+1):
        if sum(coeff * x**var for var, coeff in enumerate(factors)) == 0:
            return x
    return None

def format_poly(poly):
    return ''.join(poly).replace('+-', '-').lstrip('+')

def main():
    poly = sys.stdin.readline().strip()
    factors = factorize(poly)
    roots = [solve(factors)]
    print(format_poly('+x^{}*'.format(i) if coeff != 0 else '' for i, coeff in enumerate(factors) if coeff != 0))

if __name__ == '__main__':
    main()