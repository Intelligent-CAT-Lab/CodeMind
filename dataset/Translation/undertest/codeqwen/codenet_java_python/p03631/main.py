def main():
    # 输入
    a = int(input())

    a100 = a // 100
    a10 = (a // 10) % 10
    a1 = a % 10
    rev = a1 * 100 + a10 * 10 + a100

    ans = "Yes" if a == rev else "No"

    # 输出
    print(ans)

if __name__ == "__main__":
    main()