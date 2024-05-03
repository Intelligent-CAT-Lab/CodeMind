def main():
    x = int(input())
    y = int(input())
    a = x
    b = y
    while x % y != 0:
        z = x
        x = y
        y = z % y
    m = a + b - y
    if a % 2 == 0 or b % 2 == 0 or a == b or (a % 2 > 0 and b % 2 > 0):
        print(m + 1)
    else:
        print(m)

if __name__ == "__main__":
    main()