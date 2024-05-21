def main():
    n = int(input())
    limit7 = n // 7
    check = False
    for i in range(limit7 + 1):
        left = n - (i * 7)
        if left % 4 == 0:
            check = True
            break
    if check:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()