import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)

if __name__ == "__main__":
    input_values = input().split()
    a = int(input_values[0])
    b = int(input_values[1])

    print(gcd(a, b))