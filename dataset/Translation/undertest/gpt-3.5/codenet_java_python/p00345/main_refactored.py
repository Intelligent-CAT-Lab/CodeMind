class main:
    import sys
    
    def gcd(a, b):
        while b != 0:
            a, b = b, a % b
        return a
    
    def lcm(a, b):
        return a * (b // gcd(a, b))
    
    def irreducible_fractionalization(line):
        an, ad, bn, bd = 0, 1, 0, 1
    
        units = line.split('(')
    
        if len(units) == 2:
            units[1] = units[1][:-1]
            bn = int(units[1])
            bd = 10**len(units[1]) - 1
    
        units = units[0].split('.')
    
        if len(units) == 2:
            bd *= 10**len(units[1])
            an = int(units[0] + units[1])
            ad = 10**len(units[1])
        else:
            an = int(units[0])
    
        d = lcm(ad, bd)
        n = an * (d // ad) + bn * d // bd
        g = gcd(n, d)
        n //= g
        d //= g
    
        return str(n) + '/' + str(d)
    
    # Test case
    input_line = "0.(3)"
    output = irreducible_fractionalization(input_line)
    print(output)