from math import gcd

def main():
    z = input().split()
    x = int(z[0])
    y = int(z[1])
    a = int(z[2])
    b = int(z[3])

    c = 0
    lcm = x * y // gcd(x, y)

    i = a + (lcm - a % lcm) % lcm
    j = b - (b % lcm)
    
    if j >= i:
        c = (j - i) // lcm + 1

    print(c)

if __name__ == "__main__":
    main()