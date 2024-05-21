def main():
    s = input()
    ans = 101
    for i in range(26):
        target = chr(i+ord('a'))
        max_count = 0
        cur_count = 0
        for j in range(len(s)):
            if s[j] == target:
                cur_count = 0
            else:
                cur_count += 1
                max_count = max(max_count, cur_count)
        ans = min(ans, max_count)
    print(ans)

if __name__ == "__main__":
    main()