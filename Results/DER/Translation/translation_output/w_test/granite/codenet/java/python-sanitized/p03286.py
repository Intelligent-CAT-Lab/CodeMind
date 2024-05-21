def q(a, b):
    if b > 0:
        return floor(a, b)
    else:
        return ceil(a, b)

def r(a, b):
    return a - q(a, b) * b

def floor(a, b):
    if b < 0:
        a *= -1
        b *= -1
    if a > 0:
        return a // b
    else:
        return (a - b + 1) // b

def ceil(a, b):
    if b < 0:
        a *= -1
        b *= -1
    if a > 0:
        return (a + b - 1) // b
    else:
        return a // b

def p3286(n):
    ans = ""
    while n!= 0:
        q_val = q(n, -2)
        r_val = r(n, -2)
        ans = str(r_val) + ans
        n = q_val
    return ans

n = int(input())
print(p3286(n))