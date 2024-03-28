import math

def is_palindrome(n):
    n1 = n % 10
    n10 = (n - n1) // 10 % 10
    n100 = (n - n1 - n10 * 10) // 100 % 10
    n1000 = n // 1000

    if (n1 == n10 and n1 == n100) or (n10 == n100 and n10 == n1000):
        return "Yes"
    else:
        return "No"

n = int(input())
print(is_palindrome(n))