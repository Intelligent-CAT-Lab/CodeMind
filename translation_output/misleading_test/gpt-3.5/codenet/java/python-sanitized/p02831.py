A, B = map(int, input().split())

def calculate_gcd(a, b):
    while b:
        a, b = b, a % b
    return a

gcd = calculate_gcd(A, B)
lcm = A * B // gcd
print(lcm)