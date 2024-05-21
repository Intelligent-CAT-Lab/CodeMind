def main():
    x = int(input())
    ans = 0
    i = 0
    while x > i * (i + 1) / 2:
        i += 1
    ans = i - 1
    print(ans)

if __name__ == "__main__":
    main()