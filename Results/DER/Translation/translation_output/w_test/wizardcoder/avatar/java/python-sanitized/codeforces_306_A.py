import math

def main():
    n, m = map(int, input().split())
    for i in range(m - (n % m)):
        print(n // m, end=" ")
    for i in range(m - (n % m), m):
        print(math.ceil(n / m), end=" ")

if __name__ == '__main__':
    main()