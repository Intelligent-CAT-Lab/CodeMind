def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return a * (b // gcd(a, b))

def fractionalize(num_str):
    num_str = num_str.replace('(', '').replace(')', '')
    parts = num_str.split('.')
    if len(parts) == 1:
        numerator = int(parts[0])
        denominator = 1
    else:
        numerator = int(parts[0] + parts[1])
        denominator = 10 ** len(parts[1])

    if '(' in num_str:
        parts = num_str.split('(')
        denominator *= int(parts[1][:-1])

    numerator *= denominator // 10
    g = gcd(numerator, denominator)
    numerator //= g
    denominator //= g

    return f"{numerator}/{denominator}"

num_str = input()
print(fractionalize(num_str))