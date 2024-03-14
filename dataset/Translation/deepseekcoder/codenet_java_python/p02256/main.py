import sys

def GCD(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0: 
        return b
    else: 
        return GCD(b, a % b)

input_values = sys.stdin.readline().split()
a = int(input_values[0])
b = int(input_values[1])

print(GCD(a, b))