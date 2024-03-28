def main():
    n = int(input())
    p = int(input())
    if n == 1:
        print(p)
        return

    res = 1
    i = 2
    while i ** n <= p:
        if p % (i ** n) == 0:
            res = i
        i += 1

    print(res)

if __name__ == "__main__":
    main()