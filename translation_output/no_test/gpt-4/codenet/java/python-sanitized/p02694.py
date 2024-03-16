def main():
    x = int(input())
    count = 0
    a = 100
    while True:
        if a >= x:
            break
        a += a // 100
        count += 1
    print(count)

if __name__ == "__main__":
    main()