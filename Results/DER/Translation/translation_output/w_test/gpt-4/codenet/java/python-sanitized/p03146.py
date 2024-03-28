def main():
    s = int(input())
    seen = set()
    seen.add(s)
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        if s in seen:
            print(i)
            break
        else:
            seen.add(s)


if __name__ == "__main__":
    main()