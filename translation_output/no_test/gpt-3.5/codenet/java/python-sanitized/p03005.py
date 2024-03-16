def main():
    ans = 0
    n = int(input())
    k = int(input())

    if k == 1:
        ans = 0
    else:
        ans = n - k

    print(ans)

if __name__ == "__main__":
    main()