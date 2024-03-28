import math

def atcoder_ABC168_C(a, b, tmp1, tmp2):
    h = tmp1 / 6. * math.pi + tmp2 / 30. * math.pi / 12.
    m = tmp2 / 30. * math.pi + tmp1 / 6. * math.pi * 12.
    rad = h - m
    
    res = math.sqrt(a**2 + b**2 - 2. * a * b * math.cos(rad))
    return res

# Test input
inputs = input().split()
a = int(inputs[0])
b = int(inputs[1])
tmp1 = float(inputs[2])
tmp2 = float(inputs[3])

# Expected output
print(atcoder_ABC168_C(a, b, tmp1, tmp2))