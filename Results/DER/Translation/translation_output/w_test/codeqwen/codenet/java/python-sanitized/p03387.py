def main():
    x = sorted(list(map(int, input().split())))
    temp = 2 * x[2] - x[1] - x[0]
    ans = (temp + 1) // 2 if temp % 2 else temp // 2
    print(ans)

if __name__ == "__main__":
    main()