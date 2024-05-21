import sys

#?Â´??????Â°????Â§Â£?????????????????Â°??????
def main():
    n = int(sys.stdin.readline())
    print(n, end = ':')
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            n //= i
            print(''+ str(i), end = '')
        else:
            i += 1
    print(''+ str(n))

if __name__ == '__main__':
    main()