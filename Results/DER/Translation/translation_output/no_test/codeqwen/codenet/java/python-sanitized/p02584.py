def main():
    x = int(input())
    k = int(input())
    d = int(input())

    ans = 0
    abs_x = abs(x)
    if abs_x // d >= k:
        ans = abs_x - k * d
    else:
        sho = abs_x // d
        amari = abs_x % d
        if (k - sho) % 2 == 0:
            ans = amari
        else:
            ans = d - amari

    print(ans)

if __name__ == "__main__":
    main()