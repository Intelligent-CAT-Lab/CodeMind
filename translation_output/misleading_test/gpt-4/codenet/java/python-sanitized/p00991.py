from math import factorial as fact

def calculate_paths(r, c, a1, a2, b1, b2):
    x = abs(a1 - b1)
    y = abs(a2 - b2)
    x = min(x, r - x)
    y = min(y, c - y)
    z = 1
    C = min(x, y)
    
    if x == r - x:
        z *= 2
    if y == c - y:
        z *= 2

    b = 1
    for i in range(C):
        b = b * (x + y - i) // (i + 1)

    return (b * z) % 100000007
    
# Test case
input_string = "4 4 0 0 3 3"
r, c, a1, a2, b1, b2 = map(int, input_string.split())
print(calculate_paths(r, c, a1, a2, b1, b2))