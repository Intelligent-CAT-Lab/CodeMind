import math

def main():
    n, m = map(float, input().split())
    for i in range(m - (n % m)):
        print(int(n / m))
    for i in range(int(m - (n % m)), m):
        print(int(math.ceil(n / m)))

if __name__ == '__main__':
    main()