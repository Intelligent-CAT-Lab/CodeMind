import math

def is_palindrome(n):
    return str(n) == str(n)[::-1]

def find_nearest_palindrome(n):
    for i in range(n):
        if is_palindrome(n-i):
            return n-i
        if is_palindrome(n+i):
            return n+i
    return -1

def main():
    n = int(input())
    print(find_nearest_palindrome(n))

if __name__ == "__main__":
    main()