def GCD(a, b):
    if a < b:
        temp = a
        a = b
        b = temp
    if a % b == 0:
        return b
    else:
        return GCD(b, a%b)

a, b = map(int, input().split())
print(GCD(a, b))