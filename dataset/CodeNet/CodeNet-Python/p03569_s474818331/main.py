def main():
    s = list(input())
    n = len(s)

    ans = 0
    l, r = 0, n-1
    while l < r:
        if s[l] == "x" or s[r] == "x":
            if s[l] == "x" and s[r] == "x":
                l += 1
                r -= 1
            elif s[l] == "x":
                l += 1
                ans += 1
            elif s[r] == "x":
                r -= 1
                ans += 1
        elif s[l] == s[r]:
            l += 1
            r -= 1
        else:
            print(-1)
            exit()
    print(ans)


if __name__ == '__main__':
    main()
