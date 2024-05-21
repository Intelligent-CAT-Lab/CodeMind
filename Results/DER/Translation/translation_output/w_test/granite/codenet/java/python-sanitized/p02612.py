def main():
    n = int(input())
    x = n // 1000
    y = n % 1000
    if y == 0:
        print(0)
    else:
        ans = 1000 * (x + 1) - n
        print(ans)

if __name__ == "__main__":
    main()