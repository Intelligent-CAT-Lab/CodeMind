import sys

def main():
    n = int(input())
    c = 9
    d = 10
    for i in range(1, 10):
        for j in range(1, 1000):
            num = j * d + c
            digits = [int(digit) for digit in str(num)]
            e = sum(digits)
            if num / e > n:
                print(num)
                n -= 1
                if n == 0:
                    sys.exit(0)
        c = c * 10 + 9
        d = d * 10

if __name__ == "__main__":
    main()