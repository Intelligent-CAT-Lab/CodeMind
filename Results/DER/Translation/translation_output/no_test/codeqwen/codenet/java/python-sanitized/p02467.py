import sys

#?Python??????°??????
def main():
    n = int(sys.stdin.readline())
    print(n, end=":")
    i = 2
    while n >= i * i:
        if n % i == 0:
            n = n / i
            print(" " + str(i), end="")
        else:
            i += 1
    print(" " + str(n))

if __name__ == "__main__":
    main()