import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)

def main():
    input = sys.stdin.readline().split()
    x, y, a, b = int(input[0]), int(input[1]), int(input[2]), int(input[3])
    lcm = x * y / gcd(x, y)
    i, j = a, b
    c = 0
    while i <= j:
        if i % lcm == 0:
            break
        i += 1
    while j >= i:
        if j % lcm == 0:
            break
        j -= 1
    if j % lcm == 0 and i % lcm == 0:
        c = (j - i) / lcm + 1
    print(c)

if __name__ == "__main__":
    main()