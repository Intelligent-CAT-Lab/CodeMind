def sum_digits(n):
    sum = 0
    while n!= 0:
        sum += n % 10
        n //= 10
    return sum

def main():
    n = int(input())
    if n % sum_digits(n) == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()