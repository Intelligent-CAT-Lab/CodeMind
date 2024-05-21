def main():
    n = int(input())
    x = n
    fx = 0
    while n >= 10:
        fx += n % 10
        n //= 10
    fx += n
    if x % fx == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()