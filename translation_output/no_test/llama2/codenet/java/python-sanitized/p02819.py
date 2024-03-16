import sys

def prime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

while True:
    x = int(input())
    if prime(x):
        print(x)
        break