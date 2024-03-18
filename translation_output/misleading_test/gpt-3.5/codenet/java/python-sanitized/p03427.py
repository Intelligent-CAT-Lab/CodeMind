def main():
    N = int(input()) + 1

    s = str(N)
    length = len(s)
    c = int(s[0])
    max_num = (c - 1) + 9 * (length - 1)

    print(max_num)

if __name__ == "__main__":
    main()