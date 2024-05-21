def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def generate_palindrome(n, c):
    num = 10**n - 1
    while num >= 10**(n-1):
        if is_prime(num * 100 + c * 10 + num // 10):
            return num * 100 + c * 10 + num // 10
        num -= 1

def main():
    n, c = map(int, input().split())
    result = generate_palindrome(n, c)
    if result:
        print(result)
    else:
        print(10**(2*n-1) - 1)

if __name__ == "__main__":
    main()