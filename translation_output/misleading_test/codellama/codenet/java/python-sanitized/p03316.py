import sys

def sum_digits(n):
    sum = 0
    while n != 0:
        sum += n % 10
        n //= 10
    return sum

def main():
    n = int(sys.stdin.readline())
    a = sum_digits(n)
    if n % a == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()