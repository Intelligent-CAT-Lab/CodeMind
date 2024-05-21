def getNum(a, b):
    reverseB = 0
    while b > 0:
        reverseB = reverseB * 10 + b % 10
        b //= 10
    return a + reverseB

def main():
    a, b = map(int, input().split())
    ans = getNum(a, b)
    print(ans)

if __name__ == "__main__":
    main()