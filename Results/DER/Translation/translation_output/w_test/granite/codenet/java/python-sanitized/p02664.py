def main():
    s = input()
    count = 0
    for i in range(len(s)):
        if s[i] == 'D' or s[i] == '?':
            count += 1
            s = s[:i] + 'D' + s[i+1:]
    print(s)

if __name__ == "__main__":
    main()