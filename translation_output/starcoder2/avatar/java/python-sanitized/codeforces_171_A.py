a = int(input())
b = int(input())

def getNum(a, b):
    reverseB = 0
    while b > 0:
        reverseB = reverseB * 10 + b % 10
        b //= 10
    return a + reverseB

ans = getNum(a, b)
print(ans)