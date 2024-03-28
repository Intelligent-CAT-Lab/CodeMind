import math

def get_square_root(x):
    i = 1
    while i * (i + 1) / 2 < x:
        i += 1
    return i

print(get_square_root(6))