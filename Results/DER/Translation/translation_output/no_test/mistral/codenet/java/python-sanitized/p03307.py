import sys

def problem102a(n):
    return (n % 2 == 0) ? n : (n * 2)

n = int(input())
print(problem102a(n))