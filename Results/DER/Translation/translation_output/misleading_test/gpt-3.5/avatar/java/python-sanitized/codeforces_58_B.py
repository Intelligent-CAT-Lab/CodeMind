import sys

def codeforces_58_B():
    n = int(input())
    print(n)
    m = n
    for i in range(n - 1, 0, -1):
        if m % i == 0:
            print(i)

codeforces_58_B()