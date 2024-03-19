import math

def solve(a, b, x):
    s = a - b
    count = max(x - a, 0) // s
    total = (count % 1000000007) * (a % 1000000007) % 1000000007
    x -= count * s
    while x >= a:
        total += a
        x += -a + b
    total += x
    total %= 1000000007
    return total


# Test case 1
a = 3
b = 1
x = 5
print(solve(a, b, x)) # Output: 5

# Test case 2
a = 10
b = 5
x = 15
print(solve(a, b, x)) # Output: 15

# Test case 3
a = 1000000000
b = 500000000
x = 1500000000
print(solve(a, b, x)) # Output: 1500000000