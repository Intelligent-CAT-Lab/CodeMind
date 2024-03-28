class main:
    import re
    
    def gcd(a, b):
        if b == 0:
            return a
        return gcd(b, a % b)
    
    def lcm(a, b):
        return a * (b / gcd(a, b))
    
    def irreducible_fractionalization(s):
        if re.search(r'\.', s):
            a, b = s.split('.')
            a = int(a)
            b = int(b)
            d = lcm(a, b)
            n = a * (d / a) + b * d / b
            g = gcd(n, d)
            n /= g
            d /= g
            return '%d/%d' % (n, d)
        else:
            return '%d/1' % int(s)
    
    if __name__ == '__main__':
        s = input()
        print(irreducible_fractionalization(s))