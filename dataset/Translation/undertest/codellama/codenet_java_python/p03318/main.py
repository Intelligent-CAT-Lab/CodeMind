import math

def calculate_digits(num):
    sum = 0
    while num > 0:
        sum += num % 10
        num //= 10
    return sum

def main():
    k = int(input())
    num = 0
    d = 1
    for i in range(k):
        num += d
        if calculate_digits(num + 2 * d) < calculate_digits(num + d):
            d *= 10
        print(num)

if __name__ == "__main__":
    main()