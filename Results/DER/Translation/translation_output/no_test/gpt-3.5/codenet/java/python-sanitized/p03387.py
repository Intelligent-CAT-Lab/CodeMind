def main():
    x = [int(input()) for _ in range(3)]
    x.sort()
    temp = 2*x[2] - x[1] - x[0]
    ans = (temp + 2) // 2 + 1 if temp % 2 == 1 else temp // 2
    print(ans)

if __name__ == "__main__":
    main()