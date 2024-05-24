def main():
    N = input()

    a, b, c, d = list(N)
    if a == b == c or b == c == d:
        print("Yes")
    else:
        print("No")

if __name__ == '__main__':
    main()
