def is_palindrome(s):
    return s == s[::-1]

def main():
    n = int(input())
    for i in range(1000):
        if is_palindrome(str(n - i)):
            print(n - i)
            break
        if is_palindrome(str(n + i)):
            print(n + i)
            break

if __name__ == '__main__':
    main()