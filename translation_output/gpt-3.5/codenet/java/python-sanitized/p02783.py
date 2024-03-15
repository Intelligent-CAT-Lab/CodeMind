def main():
    line = input().split()

    h = int(line[0])
    a = int(line[1])

    n = h // a
    if h % a > 0:
        n += 1

    # Output
    print(n)

if __name__ == "__main__":
    main()