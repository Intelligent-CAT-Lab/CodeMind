def main():
    N = int(input()) + 1

    s = str(N)
    length = len(s)
    c = int(s[0])
    max_val = (c - 1) + 9 * (length - 1)

    print(max_val)

if __name__ == "__main__":
    main()