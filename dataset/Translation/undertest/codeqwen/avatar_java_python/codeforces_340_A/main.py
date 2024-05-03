def gcd(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)

def main():
    x, y, a, b = map(int, input().split())
    lcm = x * y // gcd(x, y)

    i = a
    while i <= b:
        if i % lcm == 0:
            break
        i += 1

    j = b
    while j >= a:
        if j % lcm == 0:
            break
        j -= 1

    c = 0
    if j % lcm == 0 and i % lcm == 0:
        c = (j - i) // lcm + 1

    print(c)

if __name__ == "__main__":
    main()