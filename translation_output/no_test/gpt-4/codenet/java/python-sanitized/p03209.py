import math

def main():
    n = int(input())
    x = int(input())

    print(calc(n, x))

def calc(n, x):
    if n == 0:
        return 1
    sum = 0
    x -= 1
    length = length_func(n - 1)
    p = p_func(n - 1)
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n - 1, x)
        x -= length
    if x > 0:
        x -= 1
        sum += 1
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n - 1, x)

    return sum

def length_func(n):
    return 1 + 4 * (2 ** n - 1)

def p_func(n):
    return 1 + 2 * (2 ** n - 1)

if __name__ == "__main__":
    main()