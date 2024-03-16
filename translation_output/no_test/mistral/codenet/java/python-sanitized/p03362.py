import sys

def isPrime(n):
    for i in range(2, int(n**0.5)+1):
        if n % i == 0:
            return False
    return True

def ni():
    return int(input())

def nl():
    return long(input())

def nsToChars():
    return input().tochar()

N = ni()
count = 0
for i in range(6, 55556, 5):
    if isPrime(i):
        print(i, end=" ")
        count += 1
    if count == N:
        break