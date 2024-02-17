def main():
    num = 2
    i = 3
    for _ in range(1500//2):
        num *= i
        i += 2

    n = int(input())
    print(num+2)
    for i in range(n):
        a = i+2
        if i%2 == 0:
            a = 2
        print(a)

if __name__ == '__main__':
    main()

