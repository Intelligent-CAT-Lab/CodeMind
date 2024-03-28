import sys

def getNum(a, b):
    reverseB = 0
    while b > 0:
        reverseB = reverseB * 10 + b % 10
        b /= 10
    return a + reverseB

if __name__ == "__main__":
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    ans = getNum(a, b)
    print(ans)