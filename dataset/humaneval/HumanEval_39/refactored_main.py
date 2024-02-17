import math

def is_prime(p):
    if p < 2:
        return False
    for k in range(2, min(int(math.sqrt(p)) + 1, p - 1)):
        if p % k == 0:
            return False
    return True

n = 1
f = [0, 1]
while True:
    f.append(f[-1] + f[-2])
    if is_prime(f[-1]):
        n -= 1
    if n == 0:
        print(f[-1])
        break