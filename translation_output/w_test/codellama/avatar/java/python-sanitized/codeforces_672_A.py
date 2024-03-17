import math

def get_digit(n):
    s = ""
    for i in range(1, n+1):
        s += str(i)
    return s[n-1]

n = int(input())
print(get_digit(n))