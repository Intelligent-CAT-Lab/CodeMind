def main():
    s = input().strip()  # Read input as a string similar to scanner.next()
    n = len(s)
    count = 0
    i = 0
    while i < n:
        count += 1
        if i + 1 < n and s[i] == s[i + 1]:
            if i + 2 < n:
                i += 2
                count += 1
            else:
                break
        else:
            i += 1
    print(count)

if __name__ == "__main__":
    main()