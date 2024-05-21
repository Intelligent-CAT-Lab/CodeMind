def main():
    n = int(input())
    num = 7
    res = 1

    while num < n:
        num = num * 10 + 7
        res += 1

    set_ = set()

    while True:
        if num % n == 0:
            break
        num %= n
        res += 1
        if num in set_:
            res = -1
            break
        set_.add(num)
        num = num * 10 + 7

    print(res)


if __name__ == "__main__":
    main()