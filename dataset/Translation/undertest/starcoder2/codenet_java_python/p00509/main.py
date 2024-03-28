import math

def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def is_palindrome(n):
    return str(n) == str(n)[::-1]

def main():
    n, c = map(int, input().split())
    if c < 0:
        if n == 1:
            print(11)
        else:
            print(9 * (n * 2))
    else:
        a = 10 ** n
        b = a // 10
        a -= 1
        for i in range(a, b - 1, -1):
            if is_prime(i) and is_palindrome(i * 10 ** n + c * 10 ** (n // 2) + int(str(i)[::-1])):
                print(i * 10 ** n + c * 10 ** (n // 2) + int(str(i)[::-1]))
                return

if __name__ == '__main__':
    main()