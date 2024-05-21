def is_palindrome(n):
    return str(n) == str(n)[::-1]

def main():
    n = int(input())
    for i in range(1000):
        if is_palindrome(n - i):
            print(n - i)
            break
        if is_palindrome(n + i):
            print(n + i)
            break

if __name__ == '__main__':
    main()