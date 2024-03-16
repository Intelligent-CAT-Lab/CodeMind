def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

A = int(input())
B = int(input())

result_lcm = lcm(A, B)
print(result_lcm)