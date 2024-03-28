def main():
    a, b, c = map(int, input().split())

    i = (a + b == c)
    j = (a + c == b)
    k = (b + c == a)

    if i or j or k:
        print("Yes")
    else:
        print("No")

if __name__ == '__main__':
    main()