import sys

def main():
    a = int(input())
    b = int(input())
    ans = getNum(a, b)
    print(ans)

def getNum(a, b):
    reverseB = 0
    while b > 0:
        reverseB = reverseB * 10 + b % 10
        b //= 10
    return a + reverseB

if __name__ == "__main__":
    main()